package com.github.mtgorganizer.mtgorganizerbackend.core.service.impl;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PermanentCounterRequest;
import com.github.mtgorganizer.mtgorganizerbackend.common.converter.PermanentCounterConverter;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePermanentCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.PermanentCounterService;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.MediaMetadataEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.entity.PermanentCounterEntity;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.MediaMetadataRepo;
import com.github.mtgorganizer.mtgorganizerbackend.db.repo.PermanentCounterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PermanentCounterServiceImpl implements PermanentCounterService {
    private final PermanentCounterRepo permanentCounterRepo;
    private final PermanentCounterConverter permanentCounterConverter;

    private final MediaMetadataRepo mediaMetadataRepo;

    @Override
    public List<SimplePermanentCounterModel> getAll() {
        return permanentCounterRepo.findAll().stream().map(permanentCounterConverter::entityToSimpleModel).collect(Collectors.toList());

    }

    @Override
    public void delete(PermanentCounterRequest permcounter) {
        permanentCounterRepo.deleteById(permcounter.id());
    }

    @Override
    public void create(String name, String picUrl) {
        MediaMetadataEntity picture = new MediaMetadataEntity();
        picture.setUrl(picUrl);
        MediaMetadataEntity saved = mediaMetadataRepo.save(picture);

        PermanentCounterEntity permcounter = new PermanentCounterEntity();
        permcounter.setName(name);
        permcounter.setPicture(saved);
        permanentCounterRepo.save(permcounter);
    }

    @Override
    public void update(Long id, String name, String picUrl) {
        PermanentCounterEntity permcounter = permanentCounterRepo.findById(id).orElseThrow();
        permcounter.setName(name);
        permcounter.getPicture().setUrl(picUrl);
        permanentCounterRepo.save(permcounter);
    }
}
