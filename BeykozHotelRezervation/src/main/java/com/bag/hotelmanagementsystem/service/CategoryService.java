package com.bag.hotelmanagementsystem.service;

import com.bag.hotelmanagementsystem.model.CategoryModel;


import java.util.List;

public interface CategoryService {
    List<CategoryModel> getAllCategory();
    CategoryModel saveCategory(CategoryModel categoryModel);
    CategoryModel getCategoryById(Long categoryId);
    CategoryModel updateCategory(CategoryModel categoryModel);
    void deleteCategoryById(Long categoryId);
    CategoryModel getCategoryByid(Long categoryId);
}
