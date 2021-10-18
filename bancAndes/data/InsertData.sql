INSERT INTO bancAndes ( nombre_banco) values ('BancAndes');

INSERT INTO Usuario ( login, palabra_Clave, rol, nombre, tipo_Doc_Identificacion,numero_Doc_Identificacion, direccion_Fisica, 
                    direccion_Electronica, telefono, nacionalidad, ciudad, departamento, codigo_Postal, bancAndes) 
                    values ('j.robles', 'jeje', 'Cliente', 'Jessica Robles', 'C.C', 1007557887, 'Calle 149','j.roblesm@uniandes.edu.co', 3103292233, 'colombiana', 'Bogota', 'Cundinamarca', 1001155, 'BancAndes');

INSERT INTO Oficina(nombre, direccion, nombre_banco) values ('Sede Calle 100', 'Calle 100', 'BancAndes');

INSERT INTO PuestoDeAtencion (id, bancAndes) values (1, 'BancAndes');

INSERT INTO Cajero(id, localizacion, oficina) values (1, 'Calle 100', ?);