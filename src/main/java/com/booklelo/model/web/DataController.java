package com.booklelo.model.web;

import com.booklelo.model.repositories.AuthorRepository;
import com.booklelo.model.repositories.BookRepository;
import com.booklelo.model.repositories.PublisherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * aditya created on 10/08/20
 */
@Controller
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

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }


    @GetMapping("/authors")
    public ResponseEntity<?> getAllAuthors(Model model) {
        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/publishers")
    public ResponseEntity<?> getAllPublishers() {
        return new ResponseEntity<>(publisherRepository.findAll(), HttpStatus.OK);
    }

}
