package com.example.shoppingg.dao.entity;

import com.example.shoppingg.enumm.ProductsCategory;

import javax.persistence.*;

@Entity
@Table(name="products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private Double price;
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private ProductsCategory productsCategory;

    public ProductEntity() {
    }

    public ProductEntity(Integer id, String name, String image, Double price, String description, ProductsCategory productsCategory) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.productsCategory = productsCategory;
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
        String replaceString=description.replace(".", "**");
        return replaceString;
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
}
