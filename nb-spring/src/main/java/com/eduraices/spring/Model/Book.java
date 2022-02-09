/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.spring.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author edu
 */
@Document(collection = "book")
public class Book {
    @Id
    public String _id;
    public String title;
    
    public Book () {
        
    }
    
    public Book (String title) {
        this.title = title;
    }
    
    public Book (String id, String title) {
        this._id = id;
        this.title = title;
    }
    
    public String getId () {
        return this._id;
    }
    
    public void setId (String id) {
        this._id = id;
    }
    
    public String getTitle () {
        return this.title;
    }
    
    public void setTitle (String title) {
        this.title = title;
    }
    
}
