CREATE TABLE IF NOT EXISTS players
(
    id     BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name   VARCHAR UNIQUE NOT NULL,
    rating REAL           NOT NULL
);

INSERT INTO players (name, rating) VALUES ('exampleplayer', 5.0);
INSERT INTO players (name, rating) VALUES ('Sasha', 2.2);
INSERT INTO players (name, rating) VALUES ('Stepan', 3.7);
INSERT INTO players (name, rating) VALUES ('Tanya', 4.7);
INSERT INTO players (name, rating) VALUES ('aaaaaa', 2.4);
INSERT INTO players (name, rating) VALUES ('zxc', 1.3);
