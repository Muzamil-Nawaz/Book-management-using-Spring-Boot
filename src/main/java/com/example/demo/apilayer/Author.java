package com.example.demo.apilayer;

import javax.persistence.Entity;
import javax.persistence.Id;


// Model class for Author entity with all required attributes directly
//mapped with authors table in database
@Entity
public class Author {
	
	@Id
	private long aid;
	private String name;
	private int publishedBooks;
	private String imgUrl;
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
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
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", publishedBooks=" + publishedBooks + "]";
	}
	
}
