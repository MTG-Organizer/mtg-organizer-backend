package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.CardRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleCardModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @GetMapping("/allcards/")
    public ResponseEntity<List<SimpleCardModel>> getAllCards() {
        return ResponseEntity.ok(cardService.getAll());
    }

    @PostMapping("/allperm/")
    public ResponseEntity<List<String>> postPlacingCard(@RequestBody CardRequest card) {
        return ResponseEntity.ok(cardService.postPlacingCard(card));
    }

    @GetMapping("/permeditcards/")
    public ResponseEntity<List<SimpleCardModel>> permGetCards() {
        return ResponseEntity.ok(cardService.getAll());
    }

    @PostMapping("/permeditcards/")
    public ResponseEntity<Boolean> deleteCard(@RequestBody CardRequest card) {
        cardService.delete(card);
        return ResponseEntity.ok(true);
    }
}
