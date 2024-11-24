package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.DeckChangesRequest;
import com.github.mtgorganizer.mtgorganizerbackend.api.dto.DeckRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleDeckModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.CardService;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.DeckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DeckController {
    private final DeckService deckService;
    private final CardService cardService;

    @GetMapping("/decks/")
    public ResponseEntity<List<SimpleDeckModel>> getDecks() {
        return ResponseEntity.ok(deckService.getAll());
    }

    @PostMapping("/decks/")
    public ResponseEntity<List<SimpleCardModel>> postCardsOfChosenDeck(@RequestBody DeckRequest deck) {
        return ResponseEntity.ok(cardService.getByDeckId(deck.id()));
    }

    @PostMapping("/deletedeck/")
    public ResponseEntity<Boolean> deleteDeck(@RequestBody DeckRequest deck) {
        deckService.deleteById(deck.id());
        return ResponseEntity.ok(true);
    }

    @PostMapping("/deckchange/")
    public ResponseEntity<Boolean> changeOrCreate(@RequestBody DeckChangesRequest request) {
        deckService.changeOrCreate(request);
        return ResponseEntity.ok(true);
    }
}
