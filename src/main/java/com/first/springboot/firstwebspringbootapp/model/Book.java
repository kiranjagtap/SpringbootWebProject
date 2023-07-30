package com.first.springboot.firstwebspringbootapp.model;


import com.first.springboot.firstwebspringbootapp.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="book")
    private String book;

    @ManyToOne
    private Category category;
    public Book(BookDto bookDto) {
        this.id = bookDto.getId();
        this.book = bookDto.getBook();

    }
}
