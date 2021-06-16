DROP TABLE IF EXISTS pizzas;

CREATE TABLE pizzas (
	pizza_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100),
	cost INT(300)
);

INSERT INTO pizzas VALUES (1, 'Pizza Salami', 25);
INSERT INTO pizzas VALUES (2, 'Pizza 4 sery', 25);
INSERT INTO pizzas VALUES (3, 'Pizza Bianca', 23);
INSERT INTO pizzas VALUES (4, 'Pizza Sycylijska', 25);
INSERT INTO pizzas VALUES (5, 'Pizza Calzone', 22);
INSERT INTO pizzas VALUES (6, 'Pizza Margherita', 21);
INSERT INTO pizzas VALUES (7, 'Pizza Tradycyjna', 22);
INSERT INTO pizzas VALUES (8, 'Pizza Pieczarkowa', 22);
INSERT INTO pizzas VALUES (9, 'Pizza Wegetariańska', 25);
INSERT INTO pizzas VALUES (10, 'Pizza Bekonowa', 23);
INSERT INTO pizzas VALUES (11, 'Pizza Wiejska', 23);
INSERT INTO pizzas VALUES (12, 'Pizza Hawajska', 30);
INSERT INTO pizzas VALUES (13, 'Pizza Meksykańska', 25);
INSERT INTO pizzas VALUES (14, 'Pizza Grecka', 26);
INSERT INTO pizzas VALUES (15, 'Coca Cola', 5);
INSERT INTO pizzas VALUES (16, 'Pepsi', 5);
INSERT INTO pizzas VALUES (17, 'Fanta', 5);
INSERT INTO pizzas VALUES (18, 'Mirinda', 5);
