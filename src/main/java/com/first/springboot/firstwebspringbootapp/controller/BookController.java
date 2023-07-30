package com.first.springboot.firstwebspringbootapp.controller;

import com.first.springboot.firstwebspringbootapp.dto.BookDto;
import com.first.springboot.firstwebspringbootapp.dto.BookResponse;
import com.first.springboot.firstwebspringbootapp.dto.CategoryResponse;
import com.first.springboot.firstwebspringbootapp.model.Book;
import com.first.springboot.firstwebspringbootapp.service.BookService;
import com.first.springboot.firstwebspringbootapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    CategoryService categoryService;

    @Autowired
    BookService bookService;

    @GetMapping(value = "/category/books", produces = "application/json")
    public CategoryResponse getCategoriesAndBooks() {

        CategoryResponse categoryResponse = categoryService.getCategoryWithBooks();

        return categoryResponse;
    }

    @GetMapping(value = "/books", produces = "application/json")
    public List<Book> getAllBook(){
        return bookService.getBooks();
    }

    @PostMapping
    public BookResponse createBookEntry(@RequestBody BookDto bookDto){

        return bookService.save(bookDto);
    }
}
