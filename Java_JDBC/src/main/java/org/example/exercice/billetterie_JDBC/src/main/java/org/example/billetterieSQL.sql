CREATE DATABASE IF NOT EXISTS billeterie;

USE billeterie;

CREATE TABLE IF NOT EXISTS customer 
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    email VARCHAR(150)
);

CREATE TABLE IF NOT EXISTS event_location
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    address VARCHAR(50),
    capacity INT
);

CREATE TABLE IF NOT EXISTS event
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    date_time DATETIME,
    price DOUBLE,
    ticket_sold_number INT,
    event_location_id INT,
    CONSTRAINT fk_envent_location_id FOREIGN KEY(event_location_id)REFERENCES event_location(id)
);

ALTER TABLE event
DROP COLUMN ticket_sold_number;

CREATE TABLE IF NOT EXISTS ticket
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	customer_id INT,
    event_id INT,
    CONSTRAINT fk_customer_id FOREIGN KEY(customer_id) REFERENCES customer(id),
    CONSTRAINT fk_event_id FOREIGN KEY(event_id) REFERENCES event(id)
);

DROP TABLE ticket;

INSERT INTO customer(firstname, lastname, email) VALUES
('John', 'Doe', 'johndoe@mail.test'),
('Jane', 'Smith', 'janesmith@mail.test'); 

INSERT INTO event(name, date_time, price, event_location_id) VALUES
('event1','2024-01-01 10:30:00',55, 1),
('event2','2024-02-12 20:30:00',50, 3),
('event3','2024-03-01 21:45:00',60, 5),
('event4','2024-03-15 15:30:00',33, 4),
('event5','2024-02-12 17:40:00',45, 2),
('event6','2024-01-26 20:30:00',55, 5);

INSERT INTO event_location(name, address, capacity) VALUES
('zenith', "ZAC d'Ar Mor, Bd du Zénith, 44800 Saint-Herblain", 9000),
('zenith', "1 Bd des Cités Unies, 59800 Lille", 7000),
('zenith', "211 Av. Jean Jaurès, 75019 Paris", 6804),
('Le Parc des Princes', "24 Rue du Commandant Guilbaud, 75016 Paris", 48583),
('Stade Pierre Mauroy', "261 Bd de Tournai, 59650 Villeneuve-d'Ascq", 50000);

INSERT INTO ticket(customer_id, event_id) VALUES(1,7),(1,7),(1,7),(1,7),(1,7),(1,7),(2,8),(2,8),(2,8),(2,8),(2,12),(2,12),(2,12),(1,8),(1,9),(1,10),(1,10);

SELECT  c.id as id_customer, c.firstname, c.lastname, c.email,e.id as id_event, e.name as event_name, e.date_time, e.price,el.id as id_location, el.name as location_name, el.address
FROM customer AS c
INNER JOIN ticket AS T ON c.id = t.customer_id
INNER JOIN event AS e ON t.event_id = e.id
INNER JOIN event_location AS el ON e.event_location_id = el.id
WHERE c.id = 1;


-- Récupération du Nombre de place disponible: 

SELECT e.id, e.name, (el.capacity - COUNT(t.event_id)) AS nb_place_disponible
FROM event AS e
INNER JOIN ticket AS t ON e.id = t.event_id
INNER JOIN event_location AS el ON e.event_location_id = el.id
GROUP BY e.id;

CREATE VIEW place_disponible AS 
SELECT e.id, e.name, (el.capacity - COUNT(t.event_id)) AS nb_place_disponible
FROM event AS e
INNER JOIN ticket AS t ON e.id = t.event_id
INNER JOIN event_location AS el ON e.event_location_id = el.id
GROUP BY e.id;
