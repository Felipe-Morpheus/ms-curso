CREATE TABLE IF NOT EXISTS tb_worker (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    daily_income DOUBLE NOT NULL
);