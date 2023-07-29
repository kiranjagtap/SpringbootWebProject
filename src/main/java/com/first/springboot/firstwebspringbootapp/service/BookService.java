package com.first.springboot.firstwebspringbootapp.service;

import com.first.springboot.firstwebspringbootapp.dto.BookDto;
import com.first.springboot.firstwebspringbootapp.model.Book;
import com.first.springboot.firstwebspringbootapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public Book insert(BookDto bookDto){
        Book book = new Book();
        book.setBook(bookDto.getBook());
        return bookRepository.save(book);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
