/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.spring.Controller;

import com.eduraices.spring.Controller.PublishingController;
import com.eduraices.spring.Model.Publishing;
import com.eduraices.spring.Repository.PublishingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author edu
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PublishingController {
    @Autowired
    private PublishingRepository publishingRepository;
    
    @GetMapping("/api/publishings/")
    public ResponseEntity <Page<Publishing>> findByTitle(@RequestParam(name = "title", required = false) String title, @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size) {
        
        try {
            Pageable paging = PageRequest.of(page, size);
            Page <Publishing> response = this.publishingRepository.findAll(paging);
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
