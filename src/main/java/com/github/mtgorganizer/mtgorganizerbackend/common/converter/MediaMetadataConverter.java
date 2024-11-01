package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleMediaMetadataModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.MediaMetadataEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MediaMetadataConverter {
    SimpleMediaMetadataModel entityToSimpleModel(MediaMetadataEntity entity);
}
