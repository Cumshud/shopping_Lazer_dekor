package com.example.shoppingg.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "produst")
public class ProdustEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name="produst_detail_id")
    private ProdustDetailEntity produstDetailEntity;

    public ProdustEntity() {
    }

    public ProdustEntity(Integer id, String name, Double price, String description, ProdustDetailEntity produstDetailEntity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.produstDetailEntity = produstDetailEntity;
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

    public ProdustDetailEntity getProdustDetailEntity() {
        return produstDetailEntity;
    }

    public void setProdustDetailEntity(ProdustDetailEntity produstDetailEntity) {
        this.produstDetailEntity = produstDetailEntity;
    }

}
