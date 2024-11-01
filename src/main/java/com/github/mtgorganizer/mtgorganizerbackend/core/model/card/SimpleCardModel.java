package com.github.mtgorganizer.mtgorganizerbackend.core.model.card;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleMediaMetadataModel;

public record SimpleCardModel(
        Long id,
        String name,
        SimpleMediaMetadataModel picture
) {
}
