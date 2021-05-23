package com.stackroute.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.stackroute.book.model.Book;
import com.stackroute.book.repository.BookRepository;

/**
 * Service classes are used here to implement additional business logic/validation 
 * Use Proper annotations
 */
@Service
public class BookServiceImpl implements BookService{
	
	/*
	 * Use constructor based Autowiring for BookRepository
	 */
	@Autowired
	BookRepository bookRepository;

	/*
	 * This method should be used to save a new Book.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	/*
	 * This method should be used to get a book by its id.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public Book getBookById(String bookId) {
		Book book = bookRepository.findById(bookId).get();
        return book;
		
	}
	

	/*
	 * This method should be used to get all books.Call the
	 * corresponding method of Respository interface.
	 */


	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(String bookid) {
	     bookRepository.delete(getBookById(bookid));
		
	}

	@Override
	public Book updateBook(String bookid, String bookprice) {
		// TODO Auto-generated method stub
		Optional<Book> book = bookRepository.findById(bookid);
		Book book1 = book.get();
		book1.setBookprice(bookprice);
		Book savedBook = bookRepository.save(book1);
		return savedBook;
	}
	
	
	

}
 