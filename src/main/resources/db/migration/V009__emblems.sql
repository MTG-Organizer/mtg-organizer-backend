CREATE TABLE IF NOT EXISTS emblems
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name       VARCHAR UNIQUE NOT NULL,
    picture_id BIGINT REFERENCES media_metadata (id) ON DELETE SET NULL ON UPDATE CASCADE UNIQUE
);

INSERT INTO emblems (name, picture_id) VALUES ('At the beginning of your end step, create three 1/1 white Cat creature tokens with lifelink.', NULL);
INSERT INTO emblems (name, picture_id) VALUES ('If a source would deal damage to you or a planeswalker you control, prevent all but 1 of that damage.', NULL);
INSERT INTO emblems (name, picture_id) VALUES ('Creatures you control have haste and ‘Tap: This creature deals damage equal to its power to any target.', NULL);
INSERT INTO emblems (name, picture_id) VALUES ('At the beginning of your upkeep, this emblem deals 1 damage to you.', NULL);
INSERT INTO emblems (name, picture_id) VALUES ('At the beginning of combat on your turn, create a 1/1 white Soldier creature token, then put a +1/+1 counter on each creature you control.', NULL);
