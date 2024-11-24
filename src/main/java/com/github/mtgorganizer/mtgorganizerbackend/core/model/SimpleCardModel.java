package com.github.mtgorganizer.mtgorganizerbackend.core.model;

public record SimpleCardModel(
        Long id,
        String name,
        SimpleMediaMetadataModel picture
) {
}
