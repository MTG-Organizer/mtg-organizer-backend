package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePermanentCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.PermanentCounterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PermanentCounterConverter {
    SimplePermanentCounterModel entityToSimpleModel(PermanentCounterEntity entity);
}
