CREATE TABLE IF NOT EXISTS cards_decks
(
    id              BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    card_id         BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
    deck_id         BIGINT REFERENCES decks (id) ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
    number_of_cards BIGINT                                                           NOT NULL
);
