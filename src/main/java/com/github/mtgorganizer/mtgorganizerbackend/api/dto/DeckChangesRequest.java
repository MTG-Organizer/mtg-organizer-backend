package com.github.mtgorganizer.mtgorganizerbackend.api.dto;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;

import java.util.List;

public record DeckChangesRequest(
        Long id,
        String name,
        List<SimpleCardModel> deletedCards,
        List<SimpleCardModel> addedCards
) {
}
