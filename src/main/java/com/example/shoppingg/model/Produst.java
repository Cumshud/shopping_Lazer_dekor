package com.example.shoppingg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Produst {
    @JsonProperty(value = "name")
    private String Nname;
    private double price;
    private String descr;

    public Produst() {
    }

    public Produst(String nname, double price, String descr) {
        Nname = nname;
        this.price = price;
        this.descr = descr;
    }

    public String getNname() {
        return Nname;
    }

    public void setNname(String nname) {
        Nname = nname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Produst{" +
                "Nname='" + Nname + '\'' +
                ", price=" + price +
                ", descr='" + descr + '\'' +
                '}';
    }
}
