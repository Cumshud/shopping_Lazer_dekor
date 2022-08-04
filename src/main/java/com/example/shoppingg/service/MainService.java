package com.example.shoppingg.service;

import com.example.shoppingg.dao.entity.ProdustDetailEntity;
import com.example.shoppingg.dao.entity.ProdustEntity;
import com.example.shoppingg.model.Produst;

import java.util.List;

public interface MainService {
    List<ProdustEntity> getProdust();

    Produst getProdustByID(int id);

    void saveProdust(Produst produst);

    void editProdust(Produst produst, int id);

    void deleteProdust(int id);

    ProdustEntity getProdustByName(String name);

    ProdustEntity getProdustByNameAndId(String name, Integer id);

    List<ProdustDetailEntity> getProdustDetails();

}
