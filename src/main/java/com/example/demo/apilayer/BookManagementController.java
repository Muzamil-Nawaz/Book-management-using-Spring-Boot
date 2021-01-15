package com.example.demo.apilayer;

import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class BookManagementController {
	
	public List<String> getBooks(){
		
		
		
		return List.of("demo");
	}

}
