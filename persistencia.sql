
/* Creación de la base de datos */

CREATE DATABASE DBequipos;
USE DBequipos;


/* Creación de la tabla */

CREATE TABLE equiposFutbol (

	id INT PRIMARY KEY AUTO_INCREMENT,

	nombre VARCHAR(50) NOT NULL,

	titulares INT,

	suplentes INT,

	directorTecnico VARCHAR(50),

	puntos INT,

	partidosJugados INT
);


/* Consulta de UN solo equipo */

SELECT * FROM equiposFutbol 
WHERE nombre = "nombreDelEquipoABuscar";

SELECT * FROM equiposFutbol 
WHERE id = X; 	
/* X = id del equipo a solicitar */


/* Consulta de TODOS los equipos en la tabla */

SELECT * FROM equiposFutbol;