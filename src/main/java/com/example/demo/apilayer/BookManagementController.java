package com.example.demo.apilayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servicelayer.BookManagementService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookManagementController {
	
	
	@Autowired
	BookManagementService bookmanagementservice;
	
	
	
	// Mapping get request to base url for getting books records which is redirected to the Service layer
	@GetMapping
	public List<Book> getBooks(){
		
		return bookmanagementservice.getBooks();
	}
	
	
	// Mapping post request to base url for adding book and forwarding data to Service layer 
	@PostMapping
	public List<Book> addBook(@RequestBody Book book){
		
		return List.of(bookmanagementservice.addBook(book));
	}
	
	// Mapping delete url to base url for deleting book and forwarding request to service layer
	@DeleteMapping("/books")
	public String deleteBook(@RequestParam("id") Long id) {
		return (bookmanagementservice.deleteBook(id));
	}
	
	
	// Mapping put request to base url for updating book and forwarding it to service layer
	@PutMapping
	public List<Book> updateBook(@RequestBody Book book){
		System.out.print(book);
		return List.of(bookmanagementservice.updateBook(book));
	}
	
	
	// Mapping get request to base url for getting authors records which is redirected to the Service layer
	@GetMapping("/authors")
	public List<Author> getAuthors(){
		return (bookmanagementservice.getAuthors());
	}
	
	
	// Mapping post request to base url for adding author and forwarding data to Service layer 
	@PostMapping("/authors")
	public List<Author> addAuthor(@RequestBody Author author){
		return bookmanagementservice.addAuthor(author);
	}
	
	
	// Mapping delete request to base url for deleting author and forwarding data to Service layer 
	@DeleteMapping("/authors")
	public String deleteAuthor(@RequestParam("id") Long id) {
		return (bookmanagementservice.deleteAuthor(id));
	}
	
	
	
	// Mapping put request to base url for updating author and forwarding it to service layer
	@PutMapping("/authors")
	public List<Author> updateAuthor(@RequestBody Author author){
		return List.of(bookmanagementservice.updateAuthor(author));
	}
	
	
	

}
