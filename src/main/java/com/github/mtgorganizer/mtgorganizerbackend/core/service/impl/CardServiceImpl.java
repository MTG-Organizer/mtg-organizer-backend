package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.common.converter.CardConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.card.ExtendedCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.card.SimpleCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.CardService;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.CardRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepo cardRepo;
    private final CardConverter cardConverter;

    @Override
    public List<SimpleCardModel> getAll() {
        return cardRepo.findAll().stream().map(cardConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public Optional<ExtendedCardModel> getByName(String name) {
        return Optional.ofNullable(cardConverter.entityToExtendedModel(cardRepo.findByNameIgnoreCase(name).orElse(null)));
    }
}
