package com.example.demo.apilayer;

import javax.persistence.Entity;
import javax.persistence.Id;





//Model class for Book entity with all required attributes directly
//mapped with books table in database
@Entity
public class Book {

	

	@Id
	private long bId;
	private String bName;
	private String bAuthor;
	private int price;
	private String imgUrl;
	

	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public long getbId() {
		return bId;
	}
	public void setbId(long bId) {
		this.bId = bId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", bAuthor=" + bAuthor + ", price=" + price + "]";
	}
	
}
