package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PlayerCounterRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.PlayerCounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerCounterController {
    private final PlayerCounterService playerCounterService;

    @GetMapping("/permeditplayercounters/")
    public ResponseEntity<List<SimplePlayerCounterModel>> permGetPlayercounters() {
        return ResponseEntity.ok(playerCounterService.getAll());
    }

    @PostMapping("/permeditplayercounters/")
    public ResponseEntity<Boolean> delete(@RequestBody PlayerCounterRequest playercounter) {
        playerCounterService.delete(playercounter);
        return ResponseEntity.ok(true);
    }
}
