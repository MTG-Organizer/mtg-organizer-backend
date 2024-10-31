CREATE TABLE IF NOT EXISTS cards_permanent_counters
(
    card_id              BIGINT REFERENCES cards (id) ON DELETE CASCADE ON UPDATE CASCADE,
    permanent_counter_id BIGINT REFERENCES parmanent_counters (id) ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (card_id, permanent_counter_id)
);
