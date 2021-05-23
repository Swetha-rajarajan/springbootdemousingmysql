package com.stackroute.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This model Book class is having four private properties-bookId,bookName,bookAuthor,bookPrice.
 * Give proper annotations for this entity model
 */
@Entity
public class Book {
	
	@Id
	@Column(length = 64)
	private String bookid;
	private String bookname;
	private  String bookauthor;
	private String bookprice;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookid, String bookname, String bookauthor, String bookprice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookprice() {
		return bookprice;
	}
	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}
	
	
	/*
	 * Write no-arg and parameterized constructor.
	 * Write Getter and  Setter functions for all the properties
	 * bookId is the primary key 
	 */

}
