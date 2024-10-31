CREATE TABLE IF NOT EXISTS cards_player_counters
(
    card_id           BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    player_counter_id BIGINT REFERENCES player_counters (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, player_counter_id)
);
