CREATE TABLE IF NOT EXISTS cards_tokens
(
    card_id  BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    token_id BIGINT REFERENCES tokens (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, token_id)
);

INSERT INTO cards_tokens(card_id, token_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);
