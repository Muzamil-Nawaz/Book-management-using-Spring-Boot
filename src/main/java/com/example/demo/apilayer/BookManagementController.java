package com.example.demo.apilayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servicelayer.BookManagementService;

@RestController
public class BookManagementController {
	
	
	@Autowired
	BookManagementService bookmanagementservice;
	
	
	@GetMapping
	public List<Book> getBooks(){
		
		return bookmanagementservice.getBooks();
	}
	
	@PostMapping
	public List<Book> addBook(@RequestBody Book book){
		
		return List.of(bookmanagementservice.addBook(book));
	}
	
	@DeleteMapping
	public String deleteBook(@RequestParam("id") Long id) {
		return (bookmanagementservice.deleteBook(id));
	}
	
	@PutMapping
	public List<Book> updateBook(@RequestBody Book book){
		System.out.print(book);
		return List.of(bookmanagementservice.updateBook(book));
	}
	
	
	@GetMapping("/authors")
	public List<Author> getAuthors(){
		return (bookmanagementservice.getAuthors());
	}
	
	@PostMapping("/authors")
	public List<Author> addAuthor(@RequestBody Author author){
		return bookmanagementservice.addAuthor(author);
	}
	@DeleteMapping("/authors")
	public String deleteAuthor(@RequestParam("id") Long id) {
		return (bookmanagementservice.deleteAuthor(id));
	}
	
	@PutMapping("/authors")
	public List<Author> updateAuthor(@RequestBody Author author){
		return List.of(bookmanagementservice.updateAuthor(author));
	}
	
	
	

}
