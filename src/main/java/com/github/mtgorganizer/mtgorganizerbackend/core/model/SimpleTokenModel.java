package com.github.mtgorganizer.mtgorganizerbackend.core.model;

public record SimpleTokenModel(
        Long id,
        String name,
        SimpleMediaMetadataModel picture
) {
}
