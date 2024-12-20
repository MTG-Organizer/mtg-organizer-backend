package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.DeckChangesRequest;
import com.github.mtgorganizer.mtgorganizerbackend.common.converter.DeckConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleDeckModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.DeckService;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.DeckEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.DeckRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DeckServiceImpl implements DeckService {
    private final DeckRepo deckRepo;
    private final DeckConverter deckConverter;

    @Override
    public List<SimpleDeckModel> getAll() {
        return deckRepo.findAll().stream().map(deckConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        deckRepo.deleteById(id);
    }

    @Override
    public void changeOrCreate(DeckChangesRequest request) {
        Long deckId = request.id();

        if (request.id() == null) {
            if (request.name() != null) {
                DeckEntity newDeck = new DeckEntity();
                newDeck.setName(request.name());
                deckId = deckRepo.save(newDeck).getId();
            }
        } else if (request.name() != null) {
            DeckEntity deck = deckRepo.findById(request.id()).orElseThrow();
            deck.setName(request.name());
            deckRepo.save(deck);
        }

        for (SimpleCardModel card : request.deletedCards()) {
            deckRepo.deleteCardFromDeck(card.id(), deckId);
        }

        for (SimpleCardModel card : request.addedCards()) {
            deckRepo.addCardToDeck(card.id(), deckId);
        }
    }
}
