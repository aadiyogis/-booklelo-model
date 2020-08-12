package com.booklelo.model.repositories;

import com.booklelo.model.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * aditya created on 11/08/20
 */
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
