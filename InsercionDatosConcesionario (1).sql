-- Los numeros de telefono son tipo varchar por si se tuviese que incluir codigo de pais

insert into clientes values (1, 'Juan', 'Pérez', 'Calle 1', '123456789'),
                            (2, 'María', 'García', 'Calle 2', '234567890'),
                            (3, 'Pedro', 'González', 'Calle 3', '345678901'),
                            (4, 'Ana', 'Martínez', 'Calle 4', '456789012'),
                            (5, 'Luis', 'Sánchez', 'Calle 5', '567890123'),
                            (6, 'Laura', 'López', 'Calle 6', '678901234');

insert into empleados values (1, 'Stelian', 'Baciu', 'Dependiente', 1500),
                             (2, 'Javier', 'García', 'Dependiente', 1700),
                             (3, 'Marta', 'González', 'Dependiente', 1500),
                             (4, 'Sara', 'Martínez', 'Dependiente', 1300),
                             (5, 'Pablo', 'Sánchez', 'Gerente', 1800);

insert into accesorios values (1, 'Asientos calefactables', 2000, 'Mitsubishi'),
                              (2, 'Tapiceria de cuero', 3000, 'Mitsubishi'),
                              (3, 'Asientos deportivos', 4000, 'Subaru'),
                              (4, 'Toma de aire deportiva', 2000, 'Nissan'),
                              (5, 'Aleron deportivo', 3000, 'Nissan');

insert into proveedores values (1, 'Ford', 'Calle 1', '123456789'),
                               (2,'Renault', 'Calle 2', '234567890'),
                               (3, 'VolksWagen', 'Calle 3', '345678901'),
                               (4, 'Dacia', 'Calle 4', '456789012'),
                               (5, 'Chevrolet', 'Calle 5', '567890123'),
                               (6, 'Lamborghini', 'Calle 6', '678901234');

insert into coches values (1, 'Ford', 'Mustang', 2020, 'Rojo', 35000, 1),
                          (2, 'Chevrolet', 'Camaro ZL1', 2023, 'Negro', 75000, 5),
                          (3, 'Dacia', 'Sandero', 2010, 'Blanco', 4000, 4),
                          (4, 'Ford', 'Fiesta', 2015, 'Rojo', 13000, 1),
                          (5, 'Renault', 'Clio', 2018, 'Rojo', 15000, 2),
                          (6, 'Volkswagen', 'Golf MK8', 2022, 'Blanco', 30000, 3),
                          (7, 'Lamborghini', 'Huracan Performante', 2022, 'Gris', 275000, 6);

insert into reparaciones values (1, '2020-12-28', 4500, 5),
                                (2, '2022-10-15', 3500, 4),
                                (3, '2021-08-13', 1500, 3),
                                (4, '2022-05-25', 8500, 1);

insert into ventas values (1, '2022-01-10', 75000, 1, 2),
                          (2, '2022-02-11', 13000, 2, 2),
                          (3, '2022-03-21', 35000, 3, 3),
                          (4, '2022-05-02', 25000, 4, 4);

insert into tipo_reparacion values (1, 'Reparacion de motor', 4),
                                   (2, 'Reparacion de luces', 3),
                                   (3, 'Reparacion de frenos', 2),
                                   (4, 'Reparacion de bateria', 1);

insert into forma_pago values (1, 'Efectivo', 4),
                              (2, 'Tarjeta de credito', 1),
                              (3, 'Tarjeta de debito', 3),
                              (4, 'Transferencia bancaria', 2);