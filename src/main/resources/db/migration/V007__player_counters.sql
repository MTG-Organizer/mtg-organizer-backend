CREATE TABLE IF NOT EXISTS player_counters
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name       VARCHAR UNIQUE NOT NULL,
    picture_id BIGINT REFERENCES media_metadata (id) ON DELETE SET NULL ON UPDATE CASCADE UNIQUE
);

INSERT INTO player_counters (name, picture_id) VALUES ('Poison', 26);
INSERT INTO player_counters (name, picture_id) VALUES ('Experience', 27);
INSERT INTO player_counters (name, picture_id) VALUES ('Energy', 28);
INSERT INTO player_counters (name, picture_id) VALUES ('Tickets', 29);
