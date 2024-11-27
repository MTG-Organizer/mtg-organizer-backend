CREATE TABLE IF NOT EXISTS decks_players
(
    deck_id   BIGINT REFERENCES decks (id) ON DELETE CASCADE ON UPDATE CASCADE,
    player_id BIGINT REFERENCES players (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (deck_id, player_id)
);

INSERT INTO decks_players (deck_id, player_id) VALUES (1, 1);
INSERT INTO decks_players (deck_id, player_id) VALUES (2, 2);
INSERT INTO decks_players (deck_id, player_id) VALUES (3, 3);
INSERT INTO decks_players (deck_id, player_id) VALUES (4, 4);
INSERT INTO decks_players (deck_id, player_id) VALUES (5, 5);
INSERT INTO decks_players (deck_id, player_id) VALUES (6, 6);
