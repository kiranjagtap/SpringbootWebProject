package com.first.springboot.firstwebspringbootapp.repository;

import com.first.springboot.firstwebspringbootapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
