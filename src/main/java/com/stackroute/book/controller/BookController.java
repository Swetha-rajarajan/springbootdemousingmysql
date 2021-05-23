package com.stackroute.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.stackroute.book.model.Book;
import com.stackroute.book.service.BookService;

/**
 * We are creating REST web services  and Controllers intercept the client request and generates the response.
 * Use proper annotations for this controller class.
 */
@RestController
@RequestMapping("/api/v1/bookservice/book")
public class BookController {
	
	/*
	 * Use COnstructor base Auto wiring for BookService
	 */
	@Autowired
	BookService bookService;
	
	@GetMapping
	public ResponseEntity<?> getAllBooks(){
		List<Book> booklist = bookService.getAllBooks();
		return new ResponseEntity<>(booklist,HttpStatus.OK);
	}
	
	 @GetMapping("/bookservice/{bookid}")
	    public ResponseEntity<?> getBookById(@PathVariable String bookid){
	        ResponseEntity responseEntity;

	        try {
	            bookService.getBookById(bookid);
	            responseEntity = new ResponseEntity<String>("Book Details", HttpStatus.FOUND);
	        } catch (Exception ex){
	            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
	        }

	        return responseEntity;
	    }
	 @PostMapping
		public ResponseEntity<?> addUser(@RequestBody Book book){
			Book addedbook = bookService.saveBook(book);
			return new ResponseEntity<>(addedbook,HttpStatus.CREATED);
		}
	 
	 @DeleteMapping("/delete/{bookid}")
	    public ResponseEntity<?> deleteBook(@PathVariable String bookid) {

	        ResponseEntity responseEntity;

	        try{
	            bookService.deleteBook(bookid);
	            responseEntity = new ResponseEntity("Deleted Successfully", HttpStatus.OK);

	        } catch (Exception ex) {
	            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
	        }

	        return responseEntity;
	    }

	    @PutMapping("/update/{bookid}/{bookprice}")
	    public ResponseEntity<?> updateBook(@PathVariable String bookid, @PathVariable String bookprice) {

	        ResponseEntity responseEntity;

	        try {
	            bookService.updateBook(bookid,bookprice);
	            responseEntity = new ResponseEntity<String>("Updated Successfully", HttpStatus.CREATED);
	        } catch (Exception ex) {
	            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
	        }

	        return responseEntity;

	    }


	
	
	
	/*
	 * Define a handler method which will create a book by reading the
	 * Serialized category object from request body and save the category in
	 * database. This handler method should return any one of the status messages basis on
	 * different situations: 
	 * 1. 201(CREATED - In case of successful creation of the book
	 * 2. 409(CONFLICT) - In case of duplicate bookId
	 *
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/book" using HTTP POST
	 * method".
	 */

	/*
	 * Define a handler method which will get us the book by its id.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the book found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/{bookId}" using HTTP GET method
	 */
	
	/*
	 * Define a handler method which will get us list of books.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the book found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/book" using HTTP GET method
	 */



	

}
