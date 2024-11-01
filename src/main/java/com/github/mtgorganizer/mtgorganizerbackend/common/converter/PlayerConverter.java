package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerConverter {
    SimplePlayerModel entityToSimpleModel(PlayerEntity entity);
}
