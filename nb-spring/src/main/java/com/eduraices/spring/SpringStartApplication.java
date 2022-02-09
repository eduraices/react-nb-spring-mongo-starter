package com.eduraices.spring;

import com.eduraices.spring.Repository.BookRepository;
import com.eduraices.spring.Model.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class SpringStartApplication implements CommandLineRunner {
    
    @Autowired
    public BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringStartApplication.class, args);
	}
        
        @Override
        public void run(String... args) throws Exception { 
        
            bookRepository.deleteAll();
              
            bookRepository.save(new Book ( "Robinson Crusoe" ) );
            bookRepository.save(new Book ( "Madamme Bovary" ) );
            bookRepository.save(new Book ( "Los tres mosqueteros" ) );
            bookRepository.save(new Book ( "La ciudad de los prodigios" ) );
            bookRepository.save(new Book ( "Los miserables" ) );
            
        }

}
