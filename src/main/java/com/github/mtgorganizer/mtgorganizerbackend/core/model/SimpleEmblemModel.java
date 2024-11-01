package com.github.mtgorganizer.mtgorganizerbackend.core.model;

public record SimpleEmblemModel(
        Long id,
        String name,
        SimpleMediaMetadataModel picture
) {
}
