package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.DeckChangesRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleDeckModel;

import java.util.List;

public interface DeckService {
    List<SimpleDeckModel> getAll();

    void deleteById(Long id);

    void changeOrCreate(DeckChangesRequest request);
}
