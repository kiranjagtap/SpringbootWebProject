package com.first.springboot.firstwebspringbootapp.repository;

import com.first.springboot.firstwebspringbootapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
