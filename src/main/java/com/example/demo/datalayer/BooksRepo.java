package com.example.demo.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.apilayer.Book;



//Repository for performing Books related operations on the data with JpaRepository
@Repository
public interface BooksRepo extends JpaRepository<Book,Long>{

}
