INSERT INTO medicine (name) VALUES
    ('Paracetamol'),
    ('Aspirin'),
    ('Ibuprofen'),
    ('Amoxicillin'),
    ('Omeprazole');


INSERT INTO shop (name, longitude, latitude) VALUES
    ('ABC Pharmacy', -74.0059, 40.7128),
    ('XYZ Medical', -73.9851, 40.7587),
    ('PQR Drugstore', -74.0133, 40.7061),
    ('LMN Health Mart', -73.9893, 40.7392),
    ('JKL Pharmacy', -74.0071, 40.7245);


INSERT INTO medicine_shop (medicine_id, shop_id) VALUES
    (1, 1),
    (1, 3),
    (2, 2),
    (3, 4),
    (4, 1),
    (5, 5),
    (2, 3),
    (4, 5);
