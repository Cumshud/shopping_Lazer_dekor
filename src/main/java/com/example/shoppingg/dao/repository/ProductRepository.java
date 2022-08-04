package com.example.shoppingg.dao.repository;

import com.example.shoppingg.dao.entity.ProductEntity;
import com.example.shoppingg.enumm.ProductsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

    @Query(value = "select p from ProductEntity p where p.productsCategory=:BAYRAMDEKORLARI")
    List<ProductEntity> findByBayramDekor(ProductsCategory BAYRAMDEKORLARI);

    @Query(value = "select p from ProductEntity p where p.productsCategory=:MEISETDEKORLARI")
    List<ProductEntity> findByMeisetDekor(ProductsCategory MEISETDEKORLARI);

}
