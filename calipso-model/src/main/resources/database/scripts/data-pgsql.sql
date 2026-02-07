-- Clients ayant 1 ou 2 comptes
INSERT INTO Customer (first_name, last_name, email) VALUES
('Léa','Dubois','lea.dubois@example.com'),
('Maxime','Lefevre','maxime.lefevre@example.com'),
('Clara','Morel','clara.morel@example.com'),
('Louis','Garnier','louis.garnier@example.com'),
('Emma','Faure','emma.faure@example.com'),
('Hugo','Rousseau','hugo.rousseau@example.com'),
('Chloé','Petit','chloe.petit@example.com'),
('Arthur','Martinez','arthur.martinez@example.com'),
('Camille','Bertrand','camille.bertrand@example.com'),
('Nathan','Simon','nathan.simon@example.com');

-- Clients n'ayant pas de comptes
INSERT INTO Customer (first_name, last_name, email) VALUES
('Sophie','Marchand','sophie.marchand@example.com'),
('Lucas','Fontaine','lucas.fontaine@example.com'),
('Marie','Leclerc','marie.leclerc@example.com'),
('Paul','Roux','paul.roux@example.com'),
('Julie','Gautier','julie.gautier@example.com'),
('Thomas','Clément','thomas.clement@example.com'),
('Elodie','Vidal','elodie.vidal@example.com'),
('Antoine','Perrin','antoine.perrin@example.com');

-- Comptes associés à un client
INSERT INTO Account (account_number, balance, customer_id) VALUES
('ACC2001', 1500.50, 1),
('ACC2002', 2300.75, 1),
('ACC2003', 1800.00, 2),
('ACC2004', 2200.40, 2),
('ACC2005', 3100.00, 3),
('ACC2006', 1200.90, 3),
('ACC2007', 500.00, 4),
('ACC2008', 750.30, 4),
('ACC2009', 6000.00, 5),
('ACC2010', 4300.50, 5),
('ACC2011', 100.00, 6),
('ACC2012', 900.00, 6),
('ACC2013', 250.25, 7),
('ACC2014', 180.80, 7),
('ACC2015', 700.70, 8),
('ACC2016', 950.95, 8),
('ACC2017', 2000.00, 9),
('ACC2018', 1500.50, 9),
('ACC2019', 3000.00, 10),
('ACC2020', 1200.00, 10);


-- Comptes non associés à un client
INSERT INTO Account (account_number, balance, customer_id) VALUES
('ACC2021', 500.00, NULL),
('ACC2022', 1200.50, NULL),
('ACC2023', 300.75, NULL),
('ACC2024', 4500.00, NULL),
('ACC2025', 800.00, NULL);
