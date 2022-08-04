package com.example.shoppingg.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "produst_detail")
public class ProdustDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String test;
    @OneToOne(mappedBy = "produstDetailEntity")
    private ProdustEntity produstEntityt;

//    @OneToOne(mappedBy = "produstDetailEntity")
//    private ProdustEntity produstEntity;

    public ProdustDetailEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public ProdustEntity getProdustEntityt() {
        return produstEntityt;
    }

    public void setProdustEntityt(ProdustEntity produstEntityt) {
        this.produstEntityt = produstEntityt;
    }

    public ProdustDetailEntity(Integer id, String test, ProdustEntity produstEntityt) {
        this.id = id;
        this.test = test;
        this.produstEntityt = produstEntityt;
    }


}
