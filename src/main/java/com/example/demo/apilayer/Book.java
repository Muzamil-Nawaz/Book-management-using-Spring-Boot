package com.example.demo.apilayer;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Book {

	

	@Id
	private int bId;
	private String bName;
	private String bAuthor;
	
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBookName() {
		return bName;
	}
	public void setbName(String bookName) {
		this.bName = bookName;
	}
	public String getBookAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bookAuthor) {
		this.bAuthor = bookAuthor;
	}
	
}
