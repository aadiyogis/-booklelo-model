package com.booklelo.model.web;

import com.booklelo.model.repositories.AuthorRepository;
import com.booklelo.model.repositories.BookRepository;
import com.booklelo.model.repositories.PublisherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * aditya created on 10/08/20
 */
@RestController
@RequestMapping("/data")
public class DataController {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DataController(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/authors")
    public ResponseEntity<?> getAllAuthors() {
        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/publishers")
    public ResponseEntity<?> getAllPublishers() {
        return new ResponseEntity<>(publisherRepository.findAll(), HttpStatus.OK);
    }

}
