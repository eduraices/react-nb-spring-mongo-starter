/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.spring.Repository;
import com.eduraices.spring.Model.Publishing;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author edu
 */
@EnableMongoRepositories
public interface PublishingRepository extends MongoRepository<Publishing, String> {
    
    public Page<Publishing> findByTitle ( String title, Pageable pageable);
    public Page<Publishing> findByBookId ( String book_id, Pageable pageable);
    
    @Query("{ alpha : ?0 }")
    public Page<Publishing> findByAlpha ( String alpha, Pageable pageable);
}
