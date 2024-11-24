package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.EmblemRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleEmblemModel;

import java.util.List;

public interface EmblemService {
    List<SimpleEmblemModel> getAll();

    void delete(EmblemRequest emblem);

    void create(String name, String picUrl);

    void update(Long id, String name, String picUrl);
}
