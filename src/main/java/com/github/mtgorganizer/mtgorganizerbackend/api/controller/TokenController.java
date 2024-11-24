package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.TokenRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleTokenModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TokenController {
    private final TokenService tokenService;

    @GetMapping("/permedittokens/")
    public ResponseEntity<List<SimpleTokenModel>> permGetTokens() {
        return ResponseEntity.ok(tokenService.getAll());
    }

    @PostMapping("/permedittokens/")
    public ResponseEntity<Boolean> deleteToken(@RequestBody TokenRequest token) {
        tokenService.deleteToken(token);
        return ResponseEntity.ok(true);
    }
}
