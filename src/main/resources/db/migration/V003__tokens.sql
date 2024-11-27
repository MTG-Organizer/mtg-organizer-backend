CREATE TABLE IF NOT EXISTS tokens
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name       VARCHAR UNIQUE NOT NULL,
    picture_id BIGINT REFERENCES media_metadata (id) ON DELETE SET NULL ON UPDATE CASCADE UNIQUE
);

INSERT INTO tokens (name, picture_id) VALUES ('Angel', 20);
INSERT INTO tokens (name, picture_id) VALUES ('Soldier', 21);
INSERT INTO tokens (name, picture_id) VALUES ('Spirit', 22);
INSERT INTO tokens (name, picture_id) VALUES ('Vampire', 23);
INSERT INTO tokens (name, picture_id) VALUES ('Monk', 24);
