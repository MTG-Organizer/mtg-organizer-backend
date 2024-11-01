package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.card.ExtendedCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.card.SimpleCardModel;

import java.util.List;
import java.util.Optional;

public interface CardService {
    List<SimpleCardModel> getAll();

    Optional<ExtendedCardModel> getByName(String name);
}
