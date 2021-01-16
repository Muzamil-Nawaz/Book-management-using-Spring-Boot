package com.example.demo.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.apilayer.Author;

@Repository
public interface AuthorsRepo extends JpaRepository<Author, Long>{

}
