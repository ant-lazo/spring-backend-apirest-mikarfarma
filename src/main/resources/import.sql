INSERT INTO clientes (nombre, apellido, telefono, email, create_at) VALUES('omar','lazo',999999,'ant.14sag','2021-08-21');
INSERT INTO clientes (nombre, apellido, telefono, email, create_at) VALUES('omar','lazo',999999,'ant.14sag','2021-08-21');
INSERT INTO clientes (nombre, apellido, telefono, email, create_at) VALUES('omar','lazo',999999,'ant.14sag','2021-08-21');

/* Creamos algunos usuarios con sus roles */

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email, telefono) VALUES ('olazom','$2a$10$GmsFsmwpeYRVQ4G3QO./oO10EBvjmquJARqRjE9UExAggZMcBiQe.', 1, 'omar', 'lazo', 'ant.14sag@gmail.com', 955026134);
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email, telefono) VALUES ('admin','$2a$10$c82.Jbo9YkQWj7Jt/1h5R.wgHq1Q9ivYNNJmExwoDjRyJJq5S07hO', 1, 'karina', 'jorge', 'karina@gmail.com', 956398863);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
