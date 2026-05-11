INSERT INTO region (nombre) VALUES ('Valparaíso');
INSERT INTO region (nombre) VALUES ('Metropolitana');

INSERT INTO comuna (nombre, id_region) VALUES ('Viña del Mar', 1);
INSERT INTO comuna (nombre, id_region) VALUES ('Santiago', 2);

INSERT INTO roles (nombre) VALUES ('Administracion');
INSERT INTO roles (nombre) VALUES ('Cliente');

INSERT INTO usuarios (nombre, correo, rol_id) VALUES ('Julian Pepeman', 'Jpepeman2@gmail.com', 2);
INSERT INTO usuarios (nombre, correo, rol_id) VALUES ('Maria Soto', 'MariaSotot82@hotmail.com', 1);

INSERT INTO hotel (nombre, direccion) VALUES ('Hotel Schul', 'Av. comandante Schul 7729');
INSERT INTO hotel (nombre, direccion) VALUES ('Hotel de Re: Zero', 'Av Re Sueño 2082');

INSERT INTO tipo_habitacion (descripcion, precio) VALUES ('1 cama', 29990);
INSERT INTO tipo_habitacion (descripcion, precio) VALUES ('2 camas', 54990);

INSERT INTO habitacion (id_hotel, id_tipo_hab, numero, estado) VALUES (1, 1, 101, 'Disponible');
INSERT INTO habitacion (id_hotel, id_tipo_hab, numero, estado) VALUES (1, 2, 312, 'Disponible');

INSERT INTO servicio (nombre, descripcion, precio) VALUES ('Desayuno', 'Buffet completo', 6700);
INSERT INTO servicio (nombre, descripcion, precio) VALUES ('WiFi', 'Funcionamiento a Alta velocidad', 2500);

INSERT INTO hab_servicio (id_habitacion, id_servicio) VALUES (1, 1);
INSERT INTO hab_servicio (id_habitacion, id_servicio) VALUES (1, 2);

INSERT INTO reservas (id_usuario, fecha_reserva, estado) VALUES (1, '2024-05-10', 'Confirmada');
INSERT INTO reservas (id_usuario, fecha_reserva, estado) VALUES (2, '2024-05-11', 'Pendiente');

INSERT INTO reserva_habitacion (id_reserva, id_habitacion) VALUES (1, 1);
INSERT INTO reserva_habitacion (id_reserva, id_habitacion) VALUES (2, 2);

INSERT INTO pago (id_reserva, monto, fecha_pago, metodo, estado) VALUES (1, 35000, '2026-05-20', 'Efectivo', 'Completado');
INSERT INTO pago (id_reserva, monto, fecha_pago, metodo, estado) VALUES (2, 57000, '2026-04-30', 'Tarjeta', 'Pendiente');