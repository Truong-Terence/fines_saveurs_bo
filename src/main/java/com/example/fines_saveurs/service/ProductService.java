package com.example.fines_saveurs.service;

import com.example.fines_saveurs.dao.ProductJdbcDao;
import com.example.fines_saveurs.model.Product;


public class ProductService {

    private final ProductJdbcDao productDao = new ProductJdbcDao();

    public boolean addProduct(String name, String brand, String ref, int stock, String description, String ingredients, String conditioning, String origin, double price, String fileName) {
        Product newProduct = new Product(name, brand, ref, stock, fileName, description, ingredients, conditioning, origin, price);
        return productDao.create(newProduct);
    }
}
