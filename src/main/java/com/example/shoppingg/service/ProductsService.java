package com.example.shoppingg.service;

import com.example.shoppingg.dao.entity.ProductEntity;
import com.example.shoppingg.dao.repository.ProductRepository;
import com.example.shoppingg.enumm.ProductsCategory;
import com.example.shoppingg.mapping.ProductsMapper;
import com.example.shoppingg.model.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsService {
    private ProductRepository productRepository;

    public ProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts() {

        return productRepository.findAll()
                .stream()
                .map(ProductsMapper.INSTANCE::productDto)
                .collect(Collectors.toList());
    }

    public List<ProductEntity> getByBayramdekorlari(){

        List<ProductEntity> byBayramDekor =
            productRepository.findByBayramDekor(ProductsCategory.BAYRAMDEKORLARI);
            return byBayramDekor;
        }
    public List<ProductEntity> getByMeisetdekorlari(){

        List<ProductEntity> byMeisetdekor =
                productRepository.findByMeisetDekor(ProductsCategory.MEISETDEKORLARI);
        return byMeisetdekor;
    }

    }


