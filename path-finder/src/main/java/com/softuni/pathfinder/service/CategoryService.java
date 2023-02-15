package com.softuni.pathfinder.service;

import com.softuni.pathfinder.domain.dto.models.CategoryModel;
import com.softuni.pathfinder.domain.enums.CategoryName;
import com.softuni.pathfinder.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    public CategoryModel findByName(CategoryName categoryName) {
        return this.modelMapper.map(this.categoryRepository.findByName(categoryName), CategoryModel.class);
    }
}
