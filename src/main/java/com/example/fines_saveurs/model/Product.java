package com.example.fines_saveurs.model;

public class Product {

    int id_product;
    String name;
    String brand;
    String reference;
    int stock;
    String imageUrl;
    String description;
    String ingredient;
    String conditioning;
    String origin;
    double price;


    public Product(String name, String brand, String reference, int stock, String imageUrl, String description, String ingredient, String conditioning, String origin, double price) {
        this.name = name;
        this.brand = brand;
        this.reference = reference;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.description = description;
        this.ingredient = ingredient;
        this.conditioning = conditioning;
        this.origin = origin;
        this.price = price;
    }


    public Product(int id_product, String name, String brand, String reference, int stock, String image_url, String description, String ingredient, String conditioning, String origin, double price) {
        this.id_product = id_product;
        this.name = name;
        this.brand = brand;
        this.reference = reference;
        this.stock = stock;
        this.imageUrl = image_url;
        this.description = description;
        this.ingredient = ingredient;
        this.conditioning = conditioning;
        this.origin = origin;
        this.price = price;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getConditioning() {
        return conditioning;
    }

    public void setConditioning(String conditioning) {
        this.conditioning = conditioning;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
