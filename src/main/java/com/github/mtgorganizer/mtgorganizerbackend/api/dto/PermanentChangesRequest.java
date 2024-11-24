package com.github.mtgorganizer.mtgorganizerbackend.api.dto;

import java.util.List;

public record PermanentChangesRequest(
        Long permId,
        Integer mode,
        String newName,
        String newPicUrl,
        List<CardRequest> bonds
) {
}
