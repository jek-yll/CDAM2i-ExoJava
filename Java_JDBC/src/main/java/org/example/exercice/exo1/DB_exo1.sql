CREATE DATABASE IF NOT EXISTS JDBC_exercice1;
USE JDBC_exercice1;

CREATE TABLE IF NOT EXISTS etudiant
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50), 
    prenom VARCHAR(50),
    num_classe INT,
    date_diplome DATE
);