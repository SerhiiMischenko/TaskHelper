CREATE DATABASE IF NOT EXISTS NoteHelper;

USE NoteHelper;

CREATE TABLE note (
  id BIGINT PRIMARY KEY,
  title VARCHAR(255),
  create_date TIMESTAMP,
  status VARCHAR(50)
);
