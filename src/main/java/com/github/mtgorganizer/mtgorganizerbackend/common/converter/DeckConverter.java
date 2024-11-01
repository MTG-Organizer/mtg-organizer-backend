package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleDeckModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.DeckEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeckConverter {
    SimpleDeckModel entityToSimpleModel(DeckEntity entity);
}
