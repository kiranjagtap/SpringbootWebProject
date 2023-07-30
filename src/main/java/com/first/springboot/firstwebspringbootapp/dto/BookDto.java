package com.first.springboot.firstwebspringbootapp.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDto {

    private Integer id;
    @NotEmpty
    @Size(min = 2, message = "Book name should have at least 2 characters")
    private String book;

    private Integer categoryId;
}
