package com.springboot.mysql.model;


import javax.persistence.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nameBook;
	private String authorBook;
	
	public Book() {
			
	}
	public Book(int id, String nameBook, String authorBook) {
		super();
		this.id = id;
		this.nameBook = nameBook;
		this.authorBook = authorBook;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameBook() {
		return nameBook;
	}


	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}


	public String getAuthorBook() {
		return authorBook;
	}


	public void setAuthorBook(String authorBook) {
		this.authorBook = authorBook;
	}


	
	
	
	
}
