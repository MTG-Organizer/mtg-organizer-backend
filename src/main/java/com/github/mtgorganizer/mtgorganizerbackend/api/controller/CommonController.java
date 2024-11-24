package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.CardRequest;
import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PermanentChangesRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.CardService;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.EmblemService;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.PermanentCounterService;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.PlayerCounterService;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommonController {
    private final CardService cardService;
    private final TokenService tokenService;
    private final EmblemService emblemService;
    private final PermanentCounterService permanentCounterService;
    private final PlayerCounterService playerCounterService;

    @PostMapping("/permchanges/")
    public ResponseEntity<Boolean> submitPermChanges(@RequestBody PermanentChangesRequest permanentChanges) {
        if (permanentChanges.mode() == 1 && permanentChanges.newName() != null && !permanentChanges.newName().isEmpty()) {
            if (permanentChanges.permId() == null) {
                cardService.create(permanentChanges.newName(), permanentChanges.newPicUrl());
            } else {
                cardService.update(permanentChanges.permId(), permanentChanges.newName(), permanentChanges.newPicUrl());
            }
        } else if (permanentChanges.mode() == 2) {
            if (permanentChanges.newName() != null && !permanentChanges.newName().isEmpty()) {
                if (permanentChanges.permId() == null) {
                    tokenService.create(permanentChanges.newName(), permanentChanges.newPicUrl());
                } else {
                    tokenService.update(permanentChanges.permId(), permanentChanges.newName(), permanentChanges.newPicUrl());
                }

                for (CardRequest card : permanentChanges.bonds()) {
                    cardService.addTokenBond(card.id(), permanentChanges.permId());
                }
            }
        } else if (permanentChanges.mode() == 3) {
            if (permanentChanges.newName() != null && !permanentChanges.newName().isEmpty()) {
                if (permanentChanges.permId() == null) {
                    emblemService.create(permanentChanges.newName(), permanentChanges.newPicUrl());
                } else {
                    emblemService.update(permanentChanges.permId(), permanentChanges.newName(), permanentChanges.newPicUrl());
                }

                for (CardRequest card : permanentChanges.bonds()) {
                    cardService.addEmblemBond(card.id(), permanentChanges.permId());
                }
            }
        } else if (permanentChanges.mode() == 4) {
            if (permanentChanges.newName() != null && !permanentChanges.newName().isEmpty()) {
                if (permanentChanges.permId() == null) {
                    permanentCounterService.create(permanentChanges.newName(), permanentChanges.newPicUrl());
                } else {
                    permanentCounterService.update(permanentChanges.permId(), permanentChanges.newName(), permanentChanges.newPicUrl());
                }

                for (CardRequest card : permanentChanges.bonds()) {
                    cardService.addPermanentCounterBond(card.id(), permanentChanges.permId());
                }
            }
        } else if (permanentChanges.mode() == 5) {
            if (permanentChanges.newName() != null && !permanentChanges.newName().isEmpty()) {
                if (permanentChanges.permId() == null) {
                    playerCounterService.create(permanentChanges.newName(), permanentChanges.newPicUrl());
                } else {
                    playerCounterService.update(permanentChanges.permId(), permanentChanges.newName(), permanentChanges.newPicUrl());
                }

                for (CardRequest card : permanentChanges.bonds()) {
                    cardService.addPlayerCounterBond(card.id(), permanentChanges.permId());
                }
            }
        }

        return ResponseEntity.ok(true);
    }
}
