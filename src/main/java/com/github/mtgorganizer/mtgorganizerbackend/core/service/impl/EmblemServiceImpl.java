package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.EmblemRequest;
import com.github.mtgorganizer.mtgorganizerbackend.common.converter.EmblemConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleEmblemModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.EmblemService;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.EmblemEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.MediaMetadataEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.EmblemRepo;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.MediaMetadataRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmblemServiceImpl implements EmblemService {
    private final EmblemRepo emblemRepo;
    private final EmblemConverter emblemConverter;

    private final MediaMetadataRepo mediaMetadataRepo;

    @Override
    public List<SimpleEmblemModel> getAll() {
        return emblemRepo.findAll().stream().map(emblemConverter::entityToSimpleModel).collect(Collectors.toList());
    }

    @Override
    public void delete(EmblemRequest emblem) {
        emblemRepo.deleteById(emblem.id());
    }

    @Override
    public void create(String name, String picUrl) {
        MediaMetadataEntity picture = new MediaMetadataEntity();
        picture.setUrl(picUrl);
        MediaMetadataEntity saved = mediaMetadataRepo.save(picture);

        EmblemEntity emblem = new EmblemEntity();
        emblem.setName(name);
        emblem.setPicture(saved);
        emblemRepo.save(emblem);
    }

    @Override
    public void update(Long id, String name, String picUrl) {
        EmblemEntity emblem = emblemRepo.findById(id).orElseThrow();
        emblem.setName(name);
        emblem.getPicture().setUrl(picUrl);
        emblemRepo.save(emblem);
    }
}
