package com.example.shoppingg.mapping;

import com.example.shoppingg.dao.entity.ProdustEntity;
import com.example.shoppingg.model.Produst;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdustMapper {
    ProdustMapper INSTANCE = Mappers.getMapper(ProdustMapper.class);

    @Mappings(
            {
                    @Mapping(source = "name", target = "nname"),
                    @Mapping(source = "produstDetailEntity.test", target = "descr")
            }

    )
    Produst entityToDto(ProdustEntity produstEntity);

}
