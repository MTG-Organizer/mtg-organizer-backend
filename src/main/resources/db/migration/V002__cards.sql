CREATE TABLE IF NOT EXISTS cards
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name       VARCHAR UNIQUE NOT NULL,
    picture_id BIGINT REFERENCES media_metadata (id) ON DELETE SET NULL ON UPDATE CASCADE UNIQUE
);

INSERT INTO cards (name, picture_id) VALUES ('Entreat the Angels', 1);
INSERT INTO cards (name, picture_id) VALUES ('Elspeth, Sun’s Champion', 2);
INSERT INTO cards (name, picture_id) VALUES ('Spectral Procession', 3);
INSERT INTO cards (name, picture_id) VALUES ('Legion’s Landing', 4);
INSERT INTO cards (name, picture_id) VALUES ('Monastery Mentor', 5);
INSERT INTO cards (name, picture_id) VALUES ('Basri Solidarity', 6);
INSERT INTO cards (name, picture_id) VALUES ('Spirit Shackle', 7);
INSERT INTO cards (name, picture_id) VALUES ('Athreos, Shroud-Veiled', 8);
INSERT INTO cards (name, picture_id) VALUES ('Mondrak, Glory Dominus', 9);
INSERT INTO cards (name, picture_id) VALUES ('Duskfang Mentor', 10);
INSERT INTO cards (name, picture_id) VALUES ('Skrelv, Defector Mite', 11);
INSERT INTO cards (name, picture_id) VALUES ('Келсиен, Моровая Погибель', 12);
INSERT INTO cards (name, picture_id) VALUES ('Architect of the Untamed', 13);
INSERT INTO cards (name, picture_id) VALUES ('Ticket Turbotubes', 14);
INSERT INTO cards (name, picture_id) VALUES ('Ajani Steadfast', 15);
INSERT INTO cards (name, picture_id) VALUES ('Ajani, Adversary of Tyrants', 16);
INSERT INTO cards (name, picture_id) VALUES ('Arlinn Kord', 17);
INSERT INTO cards (name, picture_id) VALUES ('Chandra, Awakened Inferno', 18);
INSERT INTO cards (name, picture_id) VALUES ('Basri Ket', 19);
