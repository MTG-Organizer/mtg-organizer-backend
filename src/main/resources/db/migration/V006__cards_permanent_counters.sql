CREATE TABLE IF NOT EXISTS cards_permanent_counters
(
    card_id              BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    permanent_counter_id BIGINT REFERENCES permanent_counters (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, permanent_counter_id)
);

INSERT INTO cards_permanent_counters(card_id, permanent_counter_id)
VALUES (6, 1),
       (7, 2),
       (8, 3),
       (9, 4),
       (10, 5);
