CREATE TABLE IF NOT EXISTS cards_players
(
    card_id   BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    player_id BIGINT REFERENCES players (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, player_id)
);

INSERT INTO cards_players (card_id, player_id) VALUES (1, 1);
INSERT INTO cards_players (card_id, player_id) VALUES (2, 2);
INSERT INTO cards_players (card_id, player_id) VALUES (3, 3);
INSERT INTO cards_players (card_id, player_id) VALUES (4, 4);
INSERT INTO cards_players (card_id, player_id) VALUES (5, 5);
INSERT INTO cards_players (card_id, player_id) VALUES (6, 6);
