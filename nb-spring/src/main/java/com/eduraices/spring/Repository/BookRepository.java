/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.spring.Repository;
import com.eduraices.spring.Model.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author edu
 */
@EnableMongoRepositories
public interface BookRepository extends MongoRepository<Book, String>{

    public Page<Book> findByTitle ( String title, Pageable pageable);
    public Page<Book> findById ( String id, Pageable pageable);
}
