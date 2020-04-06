package com.springboot.mysql.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.springboot.mysql.model.Book;
import com.springboot.mysql.service.BookService;

@RestController
@RequestMapping("/BookStore")
@CrossOrigin(origins = "*")
public class BookController {

	@Autowired
	private BookService book;
	
	@GetMapping("/getBooks")
	public Book addBook(Book book) {
		
		return this.book.addBook(book);
	}
	
	@GetMapping("/getBookId/{id}")
	public Optional<Book> getBookId(@PathVariable int id) {
		return book.getBookId(id);
	}
	
	@PostMapping("/addBooks")
	public Book addBooks (@Valid @RequestBody Book book) {
		
		return this.book.addBook(book);
	}
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		return book.deleteBook(id);
	}
	
}
