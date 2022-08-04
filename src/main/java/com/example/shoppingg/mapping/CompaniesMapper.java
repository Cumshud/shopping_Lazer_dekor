package com.example.shoppingg.mapping;

import com.example.shoppingg.dao.entity.CompaniesEntity;
import com.example.shoppingg.model.CompaniesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompaniesMapper {
    CompaniesMapper INSTANCE = Mappers.getMapper(CompaniesMapper.class);
    CompaniesDto companiesToDto(CompaniesEntity companiesEntity);
}
