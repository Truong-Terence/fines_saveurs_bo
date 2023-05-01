package com.example.fines_saveurs.dao;

import com.example.fines_saveurs.model.Category;
import com.example.fines_saveurs.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductJdbcDao implements ProductDao {

    private final Connection connection = DataBase.getConnection();

    @Override
    public boolean create(Product entity) {
        boolean success = false;
        String query = "INSERT INTO product (name, brand, reference, stock, image_url, description, ingredient, conditioning, origin, price, id_category) " +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?);";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, entity.getName());
            pst.setString(2, entity.getBrand());
            pst.setString(3, entity.getReference());
            pst.setInt(4, entity.getStock());
            pst.setString(5, entity.getImageUrl());
            pst.setString(6, entity.getDescription());
            pst.setString(7, entity.getIngredient());
            pst.setString(8, entity.getConditioning());
            pst.setString(9, entity.getOrigin());
            pst.setDouble(10, entity.getPrice());
            pst.setInt(11, entity.getCategory().getId());
            pst.executeUpdate();
            success = true;
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return success;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM product";
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("id_product");
                String name = result.getString("name");
                String brand = result.getString("brand");
                String ref = result.getString("reference");
                int stock = result.getInt("stock");
                String imageUrl = result.getString("image_url");
                String description = result.getString("description");
                String ingredients = result.getString("ingredient");
                String conditioning = result.getString("conditioning");
                String origin = result.getString("origin");
                double price = result.getDouble("price");
                Category cat = new Category(result.getInt("id_category"));
                Product prod = new Product(id, name, brand, ref, stock, imageUrl, description, ingredients, conditioning, origin, price, cat);
                products.add(prod);
            }
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(Long aLong) {
        return null;
    }

    @Override
    public void update(Product entity) {

    }

    @Override
    public void delete(Product entity) {

    }
}