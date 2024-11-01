package com.github.mtgorganizer.mtgorganizerbackend.core.model.card;

import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleDeckModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleEmblemModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleMediaMetadataModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePermanentCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerCounterModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimplePlayerModel;
import com.github.mtgorganizer.mtgorganizerbackend.core.model.SimpleTokenModel;

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
