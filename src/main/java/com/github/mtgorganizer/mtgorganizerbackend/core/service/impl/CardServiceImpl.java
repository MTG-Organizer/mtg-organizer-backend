package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.CardRequest;
import com.github.mtgorganizer.mtgorganizerbackend.common.converter.CardConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.ExtendedCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleEmblemModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePermanentCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleTokenModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.CardService;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.CardEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.MediaMetadataEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.CardRepo;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.MediaMetadataRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepo cardRepo;
    private final CardConverter cardConverter;

    private final MediaMetadataRepo mediaMetadataRepo;

    @Override
    public List<SimpleCardModel> getAll() {
        return cardRepo.findAll().stream().map(cardConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public Optional<ExtendedCardModel> getByName(String name) {
        return Optional.ofNullable(cardConverter.entityToExtendedModel(cardRepo.findByNameIgnoreCase(name).orElse(null)));
    }

    @Override
    public List<SimpleCardModel> getByDeckId(Long deckId) {
        return cardRepo.findByDeckId(deckId).stream().map(cardConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public List<String> postPlacingCard(CardRequest card) {
        ExtendedCardModel extendedCard = cardConverter.entityToExtendedModel(cardRepo.findById(card.id()).orElseThrow());

        List<String> urls = new ArrayList<>();
        urls.add(extendedCard.picture().url());
        for (SimpleTokenModel token : extendedCard.tokens()) urls.add(token.picture().url());
        for (SimplePermanentCounterModel permCounter : extendedCard.permanentCounters())
            urls.add(permCounter.picture().url());
        for (SimplePlayerCounterModel playerCounter : extendedCard.playerCounters())
            urls.add(playerCounter.picture().url());
        for (SimpleEmblemModel emblem : extendedCard.emblems()) urls.add(emblem.picture().url());

        return urls;
    }

    @Override
    public void delete(CardRequest card) {
        cardRepo.deleteById(card.id());
    }

    @Override
    public void create(String name, String picUrl) {
        MediaMetadataEntity picture = new MediaMetadataEntity();
        picture.setUrl(picUrl);
        MediaMetadataEntity saved = mediaMetadataRepo.save(picture);

        CardEntity card = new CardEntity();
        card.setName(name);
        card.setPicture(saved);
        cardRepo.save(card);
    }

    @Override
    public void update(Long id, String name, String picUrl) {
        CardEntity card = cardRepo.findById(id).orElseThrow();
        card.setName(name);
        card.getPicture().setUrl(picUrl);
        cardRepo.save(card);
    }

    @Override
    public void addTokenBond(Long id, Long permId) {
        cardRepo.addTokenBond(id, permId);
    }

    @Override
    public void addEmblemBond(Long id, Long permId) {
        cardRepo.addEmblemBond(id, permId);
    }

    @Override
    public void addPermanentCounterBond(Long id, Long permId) {
        cardRepo.addPermanentCounterBond(id, permId);
    }

    @Override
    public void addPlayerCounterBond(Long id, Long permId) {
        cardRepo.addPlayerCounterBond(id, permId);
    }
}
