package com.first.springboot.firstwebspringbootapp.model;

import com.first.springboot.firstwebspringbootapp.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category")
    private String categoryName;
    @OneToMany
    List<Book> books;

    public Category(CategoryDto categoryDto) {

        this.id = categoryDto.getId();
        this.categoryName = categoryDto.getCategory();
    }

}

