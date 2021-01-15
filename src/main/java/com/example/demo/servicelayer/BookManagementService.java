package com.example.demo.servicelayer;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.apilayer.Book;


@Service
public class BookManagementService {
	
	public List<Book> getBooks(){
		
		return List.of(new Book());
	}

}
