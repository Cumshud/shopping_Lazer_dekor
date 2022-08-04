package com.example.shoppingg.mapping;

import com.example.shoppingg.dao.entity.ProductEntity;
import com.example.shoppingg.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductsMapper {

    ProductsMapper INSTANCE = Mappers.getMapper(ProductsMapper.class);

    ProductDto productDto(ProductEntity productEntity);

}
