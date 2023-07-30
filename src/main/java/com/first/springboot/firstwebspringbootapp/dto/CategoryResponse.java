package com.first.springboot.firstwebspringbootapp.dto;

import com.first.springboot.firstwebspringbootapp.model.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CategoryResponse {

    List<Category> categoryList;

    Integer id;

    String Category;
    String response;

    Boolean success;

    public CategoryResponse() {
    }

    public CategoryResponse(List<Category> categoryList, String response) {
        this.categoryList = categoryList;
        this.response = response;
    }

    public CategoryResponse(String response) {
        this.response = response;
    }

}
