package com.first.springboot.firstwebspringbootapp.controller;

import com.first.springboot.firstwebspringbootapp.dto.BookDto;
import com.first.springboot.firstwebspringbootapp.model.Book;
import com.first.springboot.firstwebspringbootapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/books", produces = "application/json")
    public List<Book> getBooks(){
       return bookService.getBooks();
    }

    @PostMapping
    public Book insert(@Valid @RequestBody BookDto bookDto){
        return bookService.insert(bookDto);
    }


}
