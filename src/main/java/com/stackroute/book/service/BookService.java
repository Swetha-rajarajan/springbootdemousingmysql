package com.stackroute.book.service;

import java.util.List;


import com.stackroute.book.model.Book;

/**
 * Dont change or edit interface methods
 */
public interface BookService  {

	Book saveBook(Book book);
	
	Book getBookById(String bookId);
	
	List<Book> getAllBooks();
	
	public void deleteBook(String bookid);
	
	public Book updateBook(String bookid,String bookprice);
}
