INSERT INTO roles (role_id, role_name) VALUES (1, 'ROLE_USER');
INSERT INTO roles (role_id, role_name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO users (user_id, username, password) VALUES (1, 'user1', '$2a$10$52T.F83pPByW4/JZaahoae4mlyJLO8gkFEFx9Vsd4Qb7osRYe5FDm');
INSERT INTO users (user_id, username, password) VALUES (2, 'user2', '$2a$10$52T.F83pPByW4/JZaahoae4mlyJLO8gkFEFx9Vsd4Qb7osRYe5FDm');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 1);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2);