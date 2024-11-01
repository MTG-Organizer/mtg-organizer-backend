package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.PlayerCounterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerCounterConverter {
    SimplePlayerCounterModel entityToSimpleModel(PlayerCounterEntity entity);
}
