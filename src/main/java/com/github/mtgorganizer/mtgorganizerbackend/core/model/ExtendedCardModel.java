package com.github.mtgorganizer.mtgorganizerbackend.core.model;

import java.util.List;

public record ExtendedCardModel(
        Long id,
        String name,
        SimpleMediaMetadataModel picture,
        List<SimpleTokenModel> tokens,
        List<SimplePermanentCounterModel> permanentCounters,
        List<SimplePlayerCounterModel> playerCounters,
        List<SimpleEmblemModel> emblems,
        List<SimpleDeckModel> decks,
        List<SimplePlayerModel> players
) {
}
