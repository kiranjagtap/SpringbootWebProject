package com.first.springboot.firstwebspringbootapp.service.impl;

import com.first.springboot.firstwebspringbootapp.dto.BookDto;
import com.first.springboot.firstwebspringbootapp.dto.BookResponse;
import com.first.springboot.firstwebspringbootapp.model.Book;
import com.first.springboot.firstwebspringbootapp.model.Category;
import com.first.springboot.firstwebspringbootapp.repository.BookRepository;
import com.first.springboot.firstwebspringbootapp.repository.CategoryRepository;
import com.first.springboot.firstwebspringbootapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookeServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public BookResponse save(BookDto bookDto) {
        BookResponse bookResponse = null;
        Book book = new Book(bookDto);
        Category category = categoryRepository.findById(bookDto.getCategoryId()).get();
        book.setCategory(category);
        Book persistedBook = bookRepository.save(book);

        if (null != persistedBook) {
            bookResponse = new BookResponse();
            bookResponse.setSuccess(true);
            bookResponse.setId(persistedBook.getId());
            bookResponse.setBookDto(bookDto);


            return bookResponse;
        } else {
            bookResponse = new BookResponse();
            bookResponse.setSuccess(false);
            return bookResponse;
        }
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
