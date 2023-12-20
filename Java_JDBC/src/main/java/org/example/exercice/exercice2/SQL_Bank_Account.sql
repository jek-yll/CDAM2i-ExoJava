CREATE TABLE IF NOT EXISTS customer 
(
		customer_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        firstname VARCHAR(50),
        lastname VARCHAR(50),
        phone_number VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS bank_account
(
	account_number INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    balance INT DEFAULT 0, 
    customer_id INT NOT NULL,
    FOREIGN KEY(customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE IF NOT EXISTS banking_transaction
(
	transaction_number INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    amount INT, 
    status ENUM('DEPOSIT', 'WITHDRAWAL'),
	account_id INT NOT NULL,
    FOREIGN KEY(account_id) REFERENCES bank_account(account_number)
);

INSERT INTO customer(firstname, lastname, phone_number) VALUES
('test','test','0231544657'),
('test1','test1','0231544657'),
('test2','test2','0231544657'),
('test3','test2','0231544657');

INSERT INTO bank_account(balance,customer_id) VALUES 
(0,2),
(100,2),
(0,3),
(0,1);

INSERT INTO banking_transaction(amount,status,account_id) VALUES 
(100, 'DEPOSIT', 2),
(200, 'WITHDRAWAL', 1),
(100, 'DEPOSIT', 1),
(100, 'WITHDRAWAL', 1),
(100, 'DEPOSIT', 1),
(100, 'WITHDRAWAL', 1),
(100, 'DEPOSIT', 1);

DELETE FROM banking_transaction;

SELECT account_number, balance FROM bank_account ba
INNER JOIN customer cu ON cu.customer_id = ba.customer_id
WHERE ba.customer_id = 2;

SELECT * FROM banking_transaction bt
INNER JOIN bank_account ba ON ba.account_number = bt.account_id
WHERE ba.account_number = 1;

SELECT last_insert_id() ;
