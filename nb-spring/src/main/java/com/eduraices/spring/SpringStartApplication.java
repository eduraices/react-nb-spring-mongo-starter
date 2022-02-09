package com.eduraices.spring;

import com.eduraices.spring.Repository.BookRepository;
import com.eduraices.spring.Model.Book;
import com.eduraices.spring.Repository.PublishingRepository;
import com.eduraices.spring.Model.Publishing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class SpringStartApplication implements CommandLineRunner {
    
    @Autowired
    public BookRepository bookRepository;

    @Autowired
    public PublishingRepository publishingRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringStartApplication.class, args);
	}
        
        @Override
        public void run(String... args) throws Exception { 
        
            bookRepository.deleteAll();
              
            bookRepository.save(new Book ( "book1", "Robinson Crusoe" ) );
            bookRepository.save(new Book ( "book2", "Madamme Bovary" ) );
            bookRepository.save(new Book ( "book3", "Los tres mosqueteros" ) );
            bookRepository.save(new Book ( "book4", "La ciudad de los prodigios" ) );
            bookRepository.save(new Book ( "Los miserables" ) );
            
            publishingRepository.deleteAll();
            
            publishingRepository.save( new Publishing ( "pub1", "Las aventuras de Robinson Crusoe", "book1", "es", "La historia del naúfrago que sobrevivió durante años en soledad, habitando una isla paradisíaca"));
            publishingRepository.save( new Publishing ( "pub2", "La ciudad de los prodigios", "book4", "es", "Barcelona en los tiempos de la Exposición Universal"));
            publishingRepository.save( new Publishing ( "pub3", "City of prodigies", "book4", "en", "Barcelona in the age of Universal Exposition"));
            publishingRepository.save( new Publishing ( "pub4", "The adventures of Robinson Crusoe", "book1", "en", "The history of a castaway that stand alone while years, living in a paradise island"));
            publishingRepository.save( new Publishing ( "pub5", "Madamme Bovary", "book2", "es", "Una mujer de provincia está cansada de los convecionalismos y la monotonía de un marido al que no ama, y no puede dejar de soñar con otra vida"));
            
        }

}
