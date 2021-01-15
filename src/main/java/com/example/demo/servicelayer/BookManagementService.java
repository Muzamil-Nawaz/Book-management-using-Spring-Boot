package com.example.demo.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.apilayer.Book;
import com.example.demo.datalayer.BooksRepo;


@Service
public class BookManagementService {
	
	@Autowired
	BooksRepo booksrepo;
	
	public List<Book> getBooks(){
		
		return booksrepo.findAll();
	}
	
	
	public Book addBook(Book b) {
		return booksrepo.save(b);
	}

}
