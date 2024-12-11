CREATE TABLE users
(
    id    INT PRIMARY KEY,
    name  VARCHAR(100),
    age   INT,
    email VARCHAR(100)
);

-- Создаем таблицу автомобилей
CREATE TABLE cars
(
    id      INT PRIMARY KEY,
    brand   VARCHAR(50),
    model   VARCHAR(50),
    color   VARCHAR(50),
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);
