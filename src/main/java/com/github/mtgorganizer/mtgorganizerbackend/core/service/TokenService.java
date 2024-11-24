package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.TokenRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleTokenModel;

import java.util.List;

public interface TokenService {
    List<SimpleTokenModel> getAll();

    void deleteToken(TokenRequest token);

    void create(String name, String picUrl);

    void update(Long id, String name, String picUrl);
}
