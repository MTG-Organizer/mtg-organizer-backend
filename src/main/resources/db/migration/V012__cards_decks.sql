CREATE TABLE IF NOT EXISTS cards_decks
(
    id              BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    card_id         BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
    deck_id         BIGINT REFERENCES decks (id) ON DELETE CASCADE ON UPDATE CASCADE NOT NULL,
    number_of_cards BIGINT                                                           NOT NULL
);

INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (1, 1, 100);
INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (2, 2, 100);
INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (3, 3, 100);
INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (4, 4, 100);
INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (5, 5, 100);
INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (6, 6, 100);

INSERT INTO cards_decks (card_id, deck_id, number_of_cards)
VALUES (1, 7, 1),
       (2, 7, 1),
       (3, 7, 1),
       (4, 7, 1),
       (5, 7, 1),
       (6, 7, 1),
       (7, 7, 1),
       (8, 7, 1),
       (9, 7, 1),
       (10, 7, 1),
       (11, 7, 1),
       (12, 7, 1),
       (13, 7, 1),
       (14, 7, 1),
       (15, 7, 1),
       (16, 7, 1),
       (17, 7, 1),
       (18, 7, 1),
       (19, 7, 1);
