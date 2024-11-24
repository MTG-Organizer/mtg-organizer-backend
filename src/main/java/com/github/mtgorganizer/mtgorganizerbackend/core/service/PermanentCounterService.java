package com.github.mtgorganizer.mtgorganizerbackend.core.service;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PermanentCounterRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePermanentCounterModel;

import java.util.List;

public interface PermanentCounterService {
    List<SimplePermanentCounterModel> getAll();

    void delete(PermanentCounterRequest permcounter);

    void create(String name, String picUrl);

    void update(Long id, String name, String picUrl);
}
