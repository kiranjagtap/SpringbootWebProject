package com.first.springboot.firstwebspringbootapp.service;

import com.first.springboot.firstwebspringbootapp.dto.BookDto;
import com.first.springboot.firstwebspringbootapp.dto.BookResponse;
import com.first.springboot.firstwebspringbootapp.model.Book;

import java.util.List;

public interface BookService {

    public BookResponse save(BookDto bookDto);
    public List<Book> getBooks();

}
