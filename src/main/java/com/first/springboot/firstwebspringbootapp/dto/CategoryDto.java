package com.first.springboot.firstwebspringbootapp.dto;

public class CategoryDto {

    private Integer id;
    private String category;

    public CategoryDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
