package com.springboot.mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mysql.Repository.BookRepository;
import com.springboot.mysql.model.Book;

@Service
public class BookService  {

	@Autowired
	public BookRepository bookRepository;
	
	
	public List<Book> getAllBooks() {
	
		return (List<Book>) bookRepository.findAll();
	}

	
	public Optional<Book> getBookId(int id) {
		
		return (Optional<Book> ) bookRepository.findById(id);
	}

	
	public Book addBook(Book book) {
		this.bookRepository.save(book);
		return book;
	}

	
	public String deleteBook(int id) {
		bookRepository.deleteById(id);
		
		return "Book deleted with id: "+id;
	}

}
