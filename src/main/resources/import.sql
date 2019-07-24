INSERT INTO users(first_name, last_name, email, password, active) VALUES
('Damian','Nieweglowski', 'Damian220690@o2.pl','Damian', 1);

-- INSERT INTO users(first_name, last_name, email, password, active) VALUES
-- ('Damian','Nieweglowski', 'Damian220690@o2.pl','$2y$12$VyucTpLYyDyZWHxpK6nvl.b3n29Uxh/4KFLlR4bBUgcI25Ox3htDG', 1);

INSERT INTO roles(role) VALUES ('ADMIN');

INSERT INTO user_role VALUES (1,1);