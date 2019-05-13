DROP DATABASE IF EXISTS colegio;
CREATE DATABASE colegio;
USE colegio;
CREATE table cursos(
    id INT auto_increment PRIMARY KEY,
    titulo VARCHAR(25) NOT NULL,
    profesor VARCHAR(25) NOT NULL,
    dia enum('lunes', 'martes', 'miercoles', 'jueves', 'viernes'),
    turno enum('mañana', 'tarde', 'noche')
);

CREATE table alumnos(
    id INT auto_increment PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(25) NOT NULL,
    edad INT,
    idCurso INT NOT NULL
);

ALTER table alumnos
    ADD CONSTRAINT fk_alumnos_idCurso
    FOREIGN KEY(idCurso)
    REFERENCES cursos(id);
    
