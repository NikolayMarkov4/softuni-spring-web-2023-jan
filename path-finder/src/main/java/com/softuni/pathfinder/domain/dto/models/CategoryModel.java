package com.softuni.pathfinder.domain.dto.models;

import com.softuni.pathfinder.domain.enums.CategoryName;

public class CategoryModel {
    private Long id;
    private CategoryName name;

    private String description;

    public CategoryModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryName getName() {
        return name;
    }

    public void setName(CategoryName name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
