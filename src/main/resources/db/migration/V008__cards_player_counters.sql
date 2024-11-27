CREATE TABLE IF NOT EXISTS cards_player_counters
(
    card_id           BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    player_counter_id BIGINT REFERENCES player_counters (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, player_counter_id)
);

INSERT INTO cards_player_counters (card_id, player_counter_id)
VALUES (11, 1),
       (12, 2),
       (13, 3),
       (14, 4);
