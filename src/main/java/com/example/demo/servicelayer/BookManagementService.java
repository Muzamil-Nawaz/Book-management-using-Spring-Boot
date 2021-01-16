package com.example.demo.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.apilayer.Author;
import com.example.demo.apilayer.Book;
import com.example.demo.datalayer.AuthorsRepo;
import com.example.demo.datalayer.BooksRepo;
import java.util.Optional;


@Service
public class BookManagementService {
	
	@Autowired
	BooksRepo booksrepo;
	@Autowired
	AuthorsRepo authorsrepo;
	
	public List<Book> getBooks(){
		
		return booksrepo.findAll();
	}
	public Book addBook(Book book) {
		if(booksrepo.existsById(book.getbId()))
			throw new IllegalStateException("Book already exist with id "+book.getbId());
		return booksrepo.save(book);
	}

	public String deleteBook(Long id) {
		Optional<Book> b =  booksrepo.findById(id);
		if(b.isPresent()) {
			booksrepo.deleteById(id);
			return "Book with id "+id+" successfully deleted.";
		}
		else {
			return "Book does not exist with id "+id;
		}
	}	
	
	public Book updateBook(Book book) {
		if(booksrepo.existsById(book.getbId()))
			return booksrepo.save(book);
		else
			throw new IllegalStateException("No Book exists with Id "+book.getbId());
	}
	
	public List<Author> getAuthors(){
		return authorsrepo.findAll();
	}
	public List<Author> addAuthor(Author author) {

		if(authorsrepo.existsById(author.getAid()))
			throw new IllegalStateException("Author already exist with id "+author.getAid());
		return List.of(authorsrepo.save(author));
	}
	public String deleteAuthor(Long id) {
		Optional<Author> b =  authorsrepo.findById(id);
		if(b.isPresent()) {
			authorsrepo.deleteById(id);
			return "Author with id "+id+" successfully deleted.";
		}
		else {
			return "Author does not exist with id "+id;
		}
	}
	
	public Author updateAuthor(Author author) {
		if(authorsrepo.existsById(author.getAid()))
			return authorsrepo.save(author);
		else
			throw new IllegalStateException("No Author exists with Id "+author.getAid());
	}
	
}
