package com.bag.hotelmanagementsystem.serviceImpl;


import com.bag.hotelmanagementsystem.model.CategoryModel;
import com.bag.hotelmanagementsystem.service.CategoryService;
import com.bag.hotelmanagementsystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<CategoryModel> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryModel saveCategory(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    @Override
    public CategoryModel getCategoryById(Long categoryId) {
        return categoryRepository.getById(categoryId);
    }

    @Override
    public CategoryModel updateCategory(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    @Override
    public void deleteCategoryById(Long categoryId) {
     categoryRepository.deleteById(categoryId);
    }

    @Override
    public CategoryModel getCategoryByid(Long categoryId) {
        return categoryRepository.getById(categoryId);
    }
}
