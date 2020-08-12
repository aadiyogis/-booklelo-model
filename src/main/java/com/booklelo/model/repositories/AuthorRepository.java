package com.booklelo.model.repositories;

import com.booklelo.model.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * aditya created on 10/08/20
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
