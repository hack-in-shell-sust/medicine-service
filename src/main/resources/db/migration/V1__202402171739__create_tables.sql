CREATE TABLE medicine (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE shop (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    latitude DOUBLE PRECISION NOT NULL
);

CREATE TABLE medicine_shop (
    medicine_id INT NOT NULL,
    shop_id INT NOT NULL,
    PRIMARY KEY (medicine_id, shop_id),
    FOREIGN KEY (medicine_id) REFERENCES medicine(id),
    FOREIGN KEY (shop_id) REFERENCES shop(id)
);
