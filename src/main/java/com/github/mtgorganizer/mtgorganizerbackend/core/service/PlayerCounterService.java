package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PlayerCounterRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerCounterModel;

import java.util.List;

public interface PlayerCounterService {
    List<SimplePlayerCounterModel> getAll();

    void delete(PlayerCounterRequest playercounter);

    void create(String name, String picUrl);

    void update(Long id, String name, String picUrl);
}
