package com.example.demo.datalayer;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.apilayer.Book;


public interface BooksRepo extends CrudRepository<Book,Integer>{

}
