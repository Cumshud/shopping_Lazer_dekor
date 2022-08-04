package com.example.shoppingg.mapping;

import com.example.shoppingg.dao.entity.AboutEntity;
import com.example.shoppingg.model.AboutDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AboutMapper {
    AboutMapper INSTANCE = Mappers.getMapper(AboutMapper.class);
    AboutDto aboutToDto(AboutEntity aboutEntity);
}
