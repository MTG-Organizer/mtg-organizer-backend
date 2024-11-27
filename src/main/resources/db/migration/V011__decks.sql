CREATE TABLE IF NOT EXISTS decks
(
    id   BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR UNIQUE NOT NULL
);

INSERT INTO decks (name) VALUES ('exampledeck');
INSERT INTO decks (name) VALUES ('shocking');
INSERT INTO decks (name) VALUES ('blink');
INSERT INTO decks (name) VALUES ('nice');
INSERT INTO decks (name) VALUES ('destroyment');
INSERT INTO decks (name) VALUES ('aaaaaa');
