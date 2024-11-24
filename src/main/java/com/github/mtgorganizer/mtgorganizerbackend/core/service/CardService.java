package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.CardRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.ExtendedCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;

import java.util.List;
import java.util.Optional;

public interface CardService {
    List<SimpleCardModel> getAll();

    Optional<ExtendedCardModel> getByName(String name);

    List<SimpleCardModel> getByDeckId(Long deckId);

    List<String> postPlacingCard(CardRequest card);

    void delete(CardRequest card);

    void create(String name, String picUrl);

    void update(Long id, String name, String picUrl);

    void addTokenBond(Long id, Long permId);

    void addEmblemBond(Long id, Long permId);

    void addPermanentCounterBond(Long id, Long permId);

    void addPlayerCounterBond(Long id, Long permId);
}
