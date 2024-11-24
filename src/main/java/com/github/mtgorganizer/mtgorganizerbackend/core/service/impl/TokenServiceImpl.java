package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.TokenRequest;
import com.github.mtgorganizer.mtgorganizerbackend.common.converter.TokenConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleTokenModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.TokenService;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.MediaMetadataEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.TokenEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.MediaMetadataRepo;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.TokenRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {
    private final TokenRepo tokenRepo;
    private final TokenConverter tokenConverter;

    private final MediaMetadataRepo mediaMetadataRepo;

    @Override
    public List<SimpleTokenModel> getAll() {
        return tokenRepo.findAll().stream().map(tokenConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public void deleteToken(TokenRequest token) {
        tokenRepo.deleteById(token.id());
    }

    @Override
    public void create(String name, String picUrl) {
        MediaMetadataEntity picture = new MediaMetadataEntity();
        picture.setUrl(picUrl);
        MediaMetadataEntity saved = mediaMetadataRepo.save(picture);

        TokenEntity token = new TokenEntity();
        token.setName(name);
        token.setPicture(saved);
        tokenRepo.save(token);
    }

    @Override
    public void update(Long id, String name, String picUrl) {
        TokenEntity token = tokenRepo.findById(id).orElseThrow();
        token.setName(name);
        token.getPicture().setUrl(picUrl);
        tokenRepo.save(token);
    }
}
