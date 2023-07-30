package com.first.springboot.firstwebspringbootapp.service;

import com.first.springboot.firstwebspringbootapp.dto.CategoryDto;
import com.first.springboot.firstwebspringbootapp.dto.CategoryResponse;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    public CategoryResponse getCategoryWithBooks();
    public CategoryResponse save(CategoryDto categoryDto);
}
