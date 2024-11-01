package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleTokenModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.TokenEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TokenConverter {
    SimpleTokenModel entityToSimpleModel(TokenEntity entity);
}
