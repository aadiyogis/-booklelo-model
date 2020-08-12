package com.booklelo.model.repositories;

import com.booklelo.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * aditya created on 10/08/20
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
