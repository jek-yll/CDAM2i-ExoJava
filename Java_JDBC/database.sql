CREATE DATABASE demo_jdbc;
USE demo_jdbc;

CREATE TABLE personne 
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

DROP TABLE personne;