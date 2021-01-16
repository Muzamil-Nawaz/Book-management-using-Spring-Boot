package com.example.demo.apilayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	private long aid;
	private String name;
	private int publishedBooks;
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPublishedBooks() {
		return publishedBooks;
	}
	public void setPublishedBooks(int publishedBooks) {
		this.publishedBooks = publishedBooks;
	}
	
}
