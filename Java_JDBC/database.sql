CREATE DATABASE IF NOT EXISTS demo_jdbc;
USE demo_jdbc;

CREATE TABLE person 
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

DROP TABLE personne;