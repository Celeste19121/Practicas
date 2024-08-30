CREATE DATABASE biblioteca;
USE biblioteca;


CREATE TABLE autor
(
ID_autor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(100),
Apellido VARCHAR(80)
);
CREATE TABLE libro 
(
ID_Libro INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Titulo VARCHAR(80),
ISBN INT,
FK_ID_autor INT NOT NULL,
FOREIGN KEY (FK_ID_autor) REFERENCES autor (ID_autor)
);
CREATE TABLE lector
(
ID_lector  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(85),
Apellido VARCHAR(70),
Telefono INT
);

CREATE TABLE  categoria
(
ID_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(50),
FK_ID_libro INT NOT NULL,
FOREIGN KEY (FK_ID_libro) REFERENCES libro (ID_libro),
ISBN INT,
FK_ID_autor INT NOT NULL,
FOREIGN KEY (FK_ID_autor) REFERENCES autor (ID_autor)

);

CREATE TABLE prestamo
(
ID_prestamo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
ISBN INT,
FK_ID_lector INT NOT NULL,
FOREIGN KEY (FK_ID_lector) REFERENCES lector (ID_lector),
Entrega DATE,
Devolucion DATE

);
