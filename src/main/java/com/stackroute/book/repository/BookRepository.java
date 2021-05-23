package com.stackroute.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackroute.book.model.Book;

/**
 * This interface represents the Repository object
 * Use proper annotations.
 */
public interface BookRepository extends JpaRepository<Book,String>{

}
