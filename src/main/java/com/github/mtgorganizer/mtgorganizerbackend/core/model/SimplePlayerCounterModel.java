package com.github.mtgorganizer.mtgorganizerbackend.core.model;

public record SimplePlayerCounterModel(
        Long id,
        String name,
        SimpleMediaMetadataModel picture
) {
}
