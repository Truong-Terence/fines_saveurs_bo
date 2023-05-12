package com.example.fines_saveurs.service;

import com.example.fines_saveurs.dao.CategoryDao;
import com.example.fines_saveurs.dao.CategoryJdbcDao;
import com.example.fines_saveurs.model.Category;

import java.sql.SQLException;
import java.util.List;

public class CategoryService {
    private final CategoryJdbcDao categoryDao = new CategoryJdbcDao();

    public boolean addCategory(String name) {
        Category newCategory = new Category(name);
        return categoryDao.create(newCategory);
    }


    public List<Category> fetchAllCategories() {
        return categoryDao.findAll();
    }
    public Category getById(Integer id) { return categoryDao.findById(id); }

    public boolean deleteCategory(int id) {

        return categoryDao.delete(new Category(id));
    }
}
