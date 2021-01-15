package com.example.demo.apilayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	

}
