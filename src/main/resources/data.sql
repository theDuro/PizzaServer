DROP TABLE IF EXISTS pizzas;

CREATE TABLE pizzas (
	pizza_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100),
	cost INT(300)
);

INSERT INTO pizzas VALUES (1, 'pizza hawajska',18);
INSERT INTO pizzas VALUES (2, 'pizza 4 sery', 16);
INSERT INTO pizzas VALUES (3, 'pizza ostra azja', 15);
INSERT INTO pizzas VALUES (4, 'pizza grzybowa', 13);
INSERT INTO pizzas VALUES (5, 'pizza deserowa', 18);
INSERT INTO pizzas VALUES (6, 'pizza słowianski kcoioł',17);
INSERT INTO pizzas VALUES (7, 'pizza tron', 18);
INSERT INTO pizzas VALUES (8, 'pizza weganska ', 14);
INSERT INTO pizzas VALUES (9, 'pizza eko',20);
INSERT INTO pizzas VALUES (10, 'cola',4);
INSERT INTO pizzas VALUES (11, 'sok jabłkowy',5);
INSERT INTO pizzas VALUES (12, 'sok z kaktusa',7);
INSERT INTO pizzas VALUES (13, 'sko z malin',5);
INSERT INTO pizzas VALUES (14, 'frytki',5);
