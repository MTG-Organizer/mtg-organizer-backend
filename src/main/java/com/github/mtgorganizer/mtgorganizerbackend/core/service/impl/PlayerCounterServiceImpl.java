package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PlayerCounterRequest;
import com.github.mtgorganizer.mtgorganizerbackend.common.converter.PlayerCounterConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.PlayerCounterService;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.MediaMetadataEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.PlayerCounterEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.MediaMetadataRepo;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.PlayerCounterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlayerCounterServiceImpl implements PlayerCounterService {
    private final PlayerCounterRepo playerCounterRepo;
    private final PlayerCounterConverter playerCounterConverter;

    private final MediaMetadataRepo mediaMetadataRepo;

    @Override
    public List<SimplePlayerCounterModel> getAll() {
        return playerCounterRepo.findAll().stream().map(playerCounterConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public void delete(PlayerCounterRequest playercounter) {
        playerCounterRepo.deleteById(playercounter.id());
    }

    @Override
    public void create(String name, String picUrl) {
        MediaMetadataEntity picture = new MediaMetadataEntity();
        picture.setUrl(picUrl);
        MediaMetadataEntity saved = mediaMetadataRepo.save(picture);

        PlayerCounterEntity playerCounter = new PlayerCounterEntity();
        playerCounter.setName(name);
        playerCounter.setPicture(saved);
        playerCounterRepo.save(playerCounter);
    }

    @Override
    public void update(Long id, String name, String picUrl) {
        PlayerCounterEntity playerCounter = playerCounterRepo.findById(id).orElseThrow();
        playerCounter.setName(name);
        playerCounter.getPicture().setUrl(picUrl);
        playerCounterRepo.save(playerCounter);
    }
}
