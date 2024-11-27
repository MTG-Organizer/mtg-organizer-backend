CREATE TABLE IF NOT EXISTS cards_emblems
(
    card_id   BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    emblem_id BIGINT REFERENCES emblems (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, emblem_id)
);

INSERT INTO cards_emblems (card_id, emblem_id) VALUES (15, 1);
INSERT INTO cards_emblems (card_id, emblem_id) VALUES (16, 2);
INSERT INTO cards_emblems (card_id, emblem_id) VALUES (17, 3);
INSERT INTO cards_emblems (card_id, emblem_id) VALUES (18, 4);
INSERT INTO cards_emblems (card_id, emblem_id) VALUES (19, 5);
