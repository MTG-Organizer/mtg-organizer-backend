package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.EmblemRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleEmblemModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.EmblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmblemController {
    private final EmblemService emblemService;

    @GetMapping("/permeditemblems/")
    public ResponseEntity<List<SimpleEmblemModel>> permGetEmblems() {
        return ResponseEntity.ok(emblemService.getAll());
    }

    @PostMapping("/permeditemblem/")
    public ResponseEntity<Boolean> deleteEmblem(@RequestBody EmblemRequest emblem) {
        emblemService.delete(emblem);
        return ResponseEntity.ok(true);
    }
}
