-- Вставляем данные в таблицу пользователей
INSERT INTO users (id, name, age, email)
VALUES (1, 'Alice Smith', 30, 'alice@example.com'),
       (2, 'Bob Johnson', 25, 'bob@example.com'),
       (3, 'Charlie Davis', 35, 'charlie@example.com');

-- Вставляем данные в таблицу автомобилей
INSERT INTO cars (id, brand, model, color, user_id)
VALUES (1, 'Toyota', 'Corolla', 'BLACK', 1),
       (2, 'Honda', 'Civic', 'WHITE', 1),
       (3, 'Ford', 'Focus', 'BLACK', 2);
