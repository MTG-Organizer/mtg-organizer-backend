CREATE TABLE IF NOT EXISTS media_metadata
(
    id  BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    url VARCHAR UNIQUE NOT NULL
);
