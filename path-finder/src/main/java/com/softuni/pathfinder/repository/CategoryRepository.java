package com.softuni.pathfinder.repository;

import com.softuni.pathfinder.domain.entities.Category;
import com.softuni.pathfinder.domain.enums.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(CategoryName name);

}
