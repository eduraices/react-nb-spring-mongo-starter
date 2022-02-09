/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.spring.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Class Publishing: models all publishings available for each book listed
 * @author edu
 */
@Document(collection = "publishing")
public class Publishing {
    @Id
    public String id;
    public String title;
    public String book_id; // reference to book
    public String alpha; // standard international localization codes
    public String source; // url, but now we're using plain text as prototype
    
    // Constructors
    
    public Publishing () {
        
    }
    
    public Publishing (String title, String book_id) {
        this.title = title;
        this.book_id = book_id;
    }
    
    public Publishing (String title, String book_id, String alpha) {
        this.title = title;
        this.book_id = book_id;
        this.alpha = alpha;
    }
    
    public Publishing (String title, String book_id, String alpha, String source) {
        this.title = title;
        this.book_id = book_id;
        this.alpha = alpha;
        this.source = source;
    }
    
    public Publishing (String id, String title, String book_id, String alpha, String source) {
        this.id = id;
        this.title = title;
        this.book_id = book_id;
        this.alpha = alpha;
        this.source = source;
    }
    
    // Getters and Setters
    
    public String getId () {
        return this.id;
    }
    
    public void setId (String id) {
        this.id = id;
    }
    
    public String getTitle () {
        return this.title;
    }
    
    public void setTitle (String title) {
        this.title = title;
    }
    
    public String getBookId () {
        return this.book_id;
    }
    
    public void setBookId (String book_id) {
        this.book_id = book_id;
    }
    
    public String getAlpha () {
        return this.alpha;
    }
    
    public void setAlpha (String alpha) {
        this.alpha = alpha;
    }
    
    public String getSource () {
        return this.source;
    }
    
    public void setSource () {
        this.source = source;
    }
}
