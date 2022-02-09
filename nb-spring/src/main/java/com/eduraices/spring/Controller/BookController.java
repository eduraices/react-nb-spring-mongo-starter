/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.spring.Controller;
import com.eduraices.spring.Model.Book;
import com.eduraices.spring.Repository.BookRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author edu
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {
    
    @Autowired
    private BookRepository bookRepository;
    
    @GetMapping("/api/books/")
    public ResponseEntity <Page<Book>> findByTitle(@RequestParam(name = "title", required = false) String title, @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size) {
        
        try {
            Pageable paging = PageRequest.of(page, size);
            Page <Book> response = this.bookRepository.findAll(paging);
            if ( response.isEmpty() ) {
                
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
            else {
                
                return ResponseEntity.ok().body(response);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace().toString());
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
            
        }
         
    }
}
