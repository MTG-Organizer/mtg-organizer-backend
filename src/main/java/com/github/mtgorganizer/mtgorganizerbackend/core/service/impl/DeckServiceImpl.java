package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.common.converter.DeckConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleDeckModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.DeckService;
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
}
