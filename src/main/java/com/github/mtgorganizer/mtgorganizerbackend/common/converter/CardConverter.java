package com.github.mtgorganizer.mtgorganizerbackend.common.converter;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.ExtendedCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.CardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {
                MediaMetadataConverter.class,
                TokenConverter.class,
                PermanentCounterConverter.class,
                PlayerCounterConverter.class,
                EmblemConverter.class,
                DeckConverter.class,
                PlayerConverter.class
        }
)
public interface CardConverter {
    SimpleCardModel entityToSimpleModel(CardEntity entity);

    ExtendedCardModel entityToExtendedModel(CardEntity entity);
}
