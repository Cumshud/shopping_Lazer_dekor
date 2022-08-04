package com.example.shoppingg.model;

import com.example.shoppingg.enumm.ProductsCategory;

public class ProductDto {
    private Integer id;
    private String name;
    private String image;
    private Double price;
    private String description;

    private ProductsCategory productsCategory;

    public ProductDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductsCategory getProductsCategory() {
        return productsCategory;
    }

    public void setProductsCategory(ProductsCategory productsCategory) {
        this.productsCategory = productsCategory;
    }

    public ProductDto(Integer id, String name, String image, Double price, String description, ProductsCategory productsCategory) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.productsCategory = productsCategory;
    }
}
