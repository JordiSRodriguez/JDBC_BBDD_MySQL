CREATE DATABASE concesionario;
USE concesionario;

CREATE TABLE proveedores (
    IdProveedor int not null primary key,
    Nombre varchar(255) not null,
    Direccion varchar(255) not null,
    Telefono varchar(10) not null
);

CREATE TABLE coches (
  IdCoche int not null primary key,
  Marca varchar(255) not null,
  Modelo varchar(255) not null,
  Anio int not null,
  Color varchar(255) not null,
  Precio double(10,2) not null,
  IdProveedor int not null,
  foreign key (IdProveedor) references proveedores(IdProveedor)
);

CREATE TABLE clientes (
    IdCliente int not null primary key,
    Nombre varchar(255) not null,
    Apellido varchar(255) not null,
    Direccion varchar(255) not null,
    Telefono varchar(10) not null
);

CREATE TABLE empleados (
    IdEmpleado int not null primary key,
    Nombre varchar(255) not null,
    Apellido varchar(255) not null,
    Cargo varchar(255) not null,
    Salario double(10,2) not null
);

CREATE TABLE ventas (
    IdVenta int not null primary key,
    Fecha date not null,
    Monto double(10,2) not null,
    IdCliente int not null,
    IdEmpleado int not null,
    foreign key (IdCliente) references clientes(IdCliente),
    foreign key (IdEmpleado) references empleados(IdEmpleado)
);

CREATE TABLE reparaciones (
    IdReparacion int not null primary key,
    Fecha date not null,
    Coste double(10,2) not null,
    IdCoche int not null,
    foreign key (IdCoche) references coches(IdCoche)
);

CREATE TABLE accesorios (
    IdAccesorio int not null primary key,
    Nombre varchar(255) not null,
    Precio double(10,2) not null,
    Marca varchar(255) not null
);

CREATE TABLE forma_pago (
    IdFormaPago int not null primary key,
    Nombre varchar(255) not null,
    IdVenta int not null,
    foreign key (IdVenta) references ventas(IdVenta)
);

CREATE TABLE tipo_reparacion (
    IdTipoReparacion int not null primary key,
    Nombre varchar(255) not null,
    IdReparacion int not null,
    foreign key (IdReparacion) references reparaciones(IdReparacion)
);