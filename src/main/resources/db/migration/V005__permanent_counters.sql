CREATE TABLE IF NOT EXISTS permanent_counters
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name       VARCHAR UNIQUE NOT NULL,
    picture_id BIGINT REFERENCES media_metadata (id) ON DELETE SET NULL ON UPDATE CASCADE UNIQUE
);

INSERT INTO permanent_counters(name, picture_id)
VALUES ('+1/+1', 25),
       ('-0/-2', NULL),
       ('Coin', NULL),
       ('Indestructible', NULL),
       ('Lifelink', NULL);
