package com.github.mtgorganizer.mtgorganizerbackend.api.controller;

import com.github.mtgorganizer.mtgorganizerbackend.api.dto.PermanentCounterRequest;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePermanentCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.service.PermanentCounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PermanentCounterController {
    private final PermanentCounterService permanentCounterService;

    @GetMapping("/permeditpermcounters/")
    public ResponseEntity<List<SimplePermanentCounterModel>> permGetPermcounters() {
        return ResponseEntity.ok(permanentCounterService.getAll());
    }

    @PostMapping("/permeditpermcounters/")
    public ResponseEntity<Boolean> deletePermcounter(@RequestBody PermanentCounterRequest permcounter)
    {
        permanentCounterService.delete(permcounter);
        return ResponseEntity.ok(true);
    }
}
