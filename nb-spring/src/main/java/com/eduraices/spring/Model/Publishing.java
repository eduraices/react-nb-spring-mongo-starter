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
    public String _id;
    public String title;
    public String bookId; // reference to book
    public String alpha; // standard international localization codes
    public String source; // url, but now we're using plain text as prototype
    
    // Constructors
    
    public Publishing () {
        
    }
    
    public Publishing (String title, String bookId) {
        this.title = title;
        this.bookId = bookId;
    }
    
    public Publishing (String title, String bookId, String alpha) {
        this.title = title;
        this.bookId = bookId;
        this.alpha = alpha;
    }
    
    public Publishing (String title, String bookId, String alpha, String source) {
        this.title = title;
        this.bookId = bookId;
        this.alpha = alpha;
        this.source = source;
    }
    
    public Publishing (String id, String title, String bookId, String alpha, String source) {
        this._id = id;
        this.title = title;
        this.bookId = bookId;
        this.alpha = alpha;
        this.source = source;
    }
    
    // Getters and Setters
    
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
    
    public String getBookId () {
        return this.bookId;
    }
    
    public void setBookId (String book_id) {
        this.bookId = bookId;
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
