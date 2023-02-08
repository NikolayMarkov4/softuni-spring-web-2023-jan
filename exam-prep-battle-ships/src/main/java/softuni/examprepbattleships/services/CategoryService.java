package softuni.examprepbattleships.services;

import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.examprepbattleships.domain.entities.Category;
import softuni.examprepbattleships.domain.enums.CategoryType;
import softuni.examprepbattleships.domain.model.CategoryModel;
import softuni.examprepbattleships.repositories.CategoryRepository;

import java.util.Arrays;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    private void postConstruct() {
        if (this.categoryRepository.count() == 0) {
            this.categoryRepository.saveAllAndFlush(Arrays.stream(CategoryType.values())
                    .map(enumValue -> CategoryModel.builder()
                            .name(enumValue)
                            .description("fight me")
                            .build())
                    .map(categoryModel -> this.modelMapper.map(categoryModel, Category.class))
                    .toList());
        }
    }

    public CategoryModel findByName(CategoryType name) {
        return this.modelMapper.map(this.categoryRepository.findByName(name).orElseThrow(), CategoryModel.class);
    }
}
