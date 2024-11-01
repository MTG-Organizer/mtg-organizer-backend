package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleEmblemModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.EmblemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmblemConverter {
    SimpleEmblemModel entityToSimpleModel(EmblemEntity entity);
}
