--- Sentencias SQL para la creaci�n del esquema de bancAndes

-- USO
-- Copie el contenido de este archivo en una pesta�a SQL de SQL Developer
-- Ejec�telo como un script - Utilice el bot�n correspondiente de la pesta�a utilizada

-- Creaci�n del secuenciador
create sequence bancAndes_sequence;

-- Creaaci�n de la tabla ACCION
CREATE TABLE Accion
(   ID NUMBER NOT NULL,
    CONSTRAINT Accion_PK PRIMARY KEY (ID)
);

-- Creaaci�n de la tabla BancAndes y especificaci�n de sus restricciones
CREATE TABLE BancAndes 
(	NOMBRE_BANCO VARCHAR2(50) NOT NULL, 
    CONSTRAINT BancAndes_PK PRIMARY KEY (NOMBRE_BANCO)
);

-- Creaaci�n de la tabla PuestosDeAtencion y especificaci�n de sus restricciones
CREATE TABLE PuestosDeAtencion 
(	ID NUMBER NOT NULL, 
    BANCANDES VARCHAR2(50) NOT NULL, 
    CONSTRAINT PuestosDeAtencion_PK PRIMARY KEY (ID),
    CONSTRAINT PuestosDeAtencionBancAndes_FK FOREIGN KEY (BANCANDES)
        REFERENCES BancAndes(NOMBRE_BANCO)
);

-- Creaaci�n de la tabla Oficina y especificaci�n de sus restricciones
CREATE TABLE Oficina 
(	NOMBRE VARCHAR(20) NOT NULL,
    DIRECCION VARCHAR(20) NOT NULL,
    PUNTOS_DE_ATENCION NUMBER NOT NULL,
    NOMBRE_BANCO VARCHAR(50) NOT NULL,
    CONSTRAINT Oficina_PK PRIMARY KEY (NOMBRE),
    CONSTRAINT PuestosDeAtencionOficina_FK FOREIGN KEY (PUNTOS_DE_ATENCION) 
        REFERENCES PuestosDeAtencion(ID),
    CONSTRAINT BancAndesOficina_FK FOREIGN KEY (NOMBRE_BANCO) 
        REFERENCES BancAndes(NOMBRE_BANCO)
);

-- Creaaci�n de las tablas de las sunclases de Puestos 
CREATE TABLE Cajero
(	ID NUMBER NOT NULL,
    LOCALIZACION VARCHAR(30) NOT NULL,
    OFICINA VARCHAR(20) NOT NULL,
    CONSTRAINT Cajero_PK PRIMARY KEY (ID),
    CONSTRAINT PuestosDeAtencionCajero_FK FOREIGN KEY (ID) 
        REFERENCES PuestosDeAtencion(ID),
    CONSTRAINT OficinaCajero_FK FOREIGN KEY (OFICINA) 
        REFERENCES Oficina(NOMBRE)
);
CREATE TABLE CajeroAutomatico
(   ID NUMBER NOT NULL,
    LOCALIZACION VARCHAR(50) NOT NULL,
    OFICINA VARCHAR(20) NOT NULL,
    CONSTRAINT CajeroAutomatico_PK PRIMARY KEY (ID),
    CONSTRAINT IdCajeroAutomatico_FK FOREIGN KEY (ID)
        REFERENCES PuestosDeAtencion(ID),
    CONSTRAINT OficinaCajeroAutomatico_FK FOREIGN KEY (OFICINA)
        REFERENCES Oficina(NOMBRE)
);

CREATE TABLE AppMovil
(   ID NUMBER NOT NULL,
    NOMBRE VARCHAR(20) NOT NULL UNIQUE,
    CONSTRAINT AppMovil_PK PRIMARY KEY (ID),
    CONSTRAINT IdAppMovil_FK FOREIGN KEY (ID)
        REFERENCES PuestosDeAtencion(ID)
);

CREATE TABLE Web
(   ID NUMBER NOT NULL,
    URL VARCHAR(100) NOT NULL UNIQUE,
    CONSTRAINT Web_PK PRIMARY KEY (ID),
    CONSTRAINT IdWeb_FK FOREIGN KEY (ID)
        REFERENCES PuestosDeAtencion(ID)
);

-- Creaaci�n de la tabla de Ususario y las tablas de sus subclases
CREATE TABLE Usuario 
(	LOGIN VARCHAR(20) NOT NULL,
    TIPO_DOC_IDENTIFICACION VARCHAR(20) NOT NULL,
    NUMERO_DOC_IDENTIFICACION NUMBER NOT NULL,
    PALABRA_CLAVE VARCHAR(20) NOT NULL,
    ROL VARCHAR(20) NOT NULL,
    NOMBRE VARCHAR(40) NOT NULL,
    DIRECCION_FISICA VARCHAR(30) NOT NULL,
    DIRECCION_ELECTRONICA VARCHAR(30) NOT NULL,
    TELEFONO NUMBER NOT NULL,
    NACIONALIDAD VARCHAR(20) NOT NULL,
    CIUDAD VARCHAR(20) NOT NULL,
    DEPARTAMENTO VARCHAR(20) NOT NULL,
    CODIGO_POSTAL NUMBER NOT NULL,
    BANCANDES VARCHAR(50) NOT NULL UNIQUE,
    CONSTRAINT Usuario_PK PRIMARY KEY (LOGIN),
    CONSTRAINT Usuario_FK FOREIGN KEY (BANCANDES) 
        REFERENCES BancAndes(NOMBRE_BANCO)
);

CREATE TABLE CajeroFuncionario
(	LOGIN VARCHAR(20) NOT NULL,
    OFICINA VARCHAR(20) NOT NULL,
    CAJERO NUMBER NOT NULL,
    CONSTRAINT CajeroFuncionario_PK PRIMARY KEY (LOGIN),
    CONSTRAINT UsuarioCajeroFuncionario_FK FOREIGN KEY (LOGIN) 
        REFERENCES Usuario(LOGIN),
    CONSTRAINT OficinaCajeroFuncionario_FK FOREIGN KEY (OFICINA) 
        REFERENCES Oficina(NOMBRE),
    CONSTRAINT CajeroCajeroFuncionario_FK FOREIGN KEY (CAJERO) 
        REFERENCES Cajero(ID)
);

CREATE TABLE Cliente
(	LOGIN VARCHAR(20) NOT NULL,
    TIPO_PERSONA VARCHAR(20) NOT NULL,
    CAJERO NUMBER NOT NULL,
    CONSTRAINT Cliente_PK PRIMARY KEY (LOGIN),
    CONSTRAINT UsuarioCliente_FK FOREIGN KEY (LOGIN) 
        REFERENCES Usuario(LOGIN)
);

CREATE TABLE GerenteOficina
(	LOGIN VARCHAR(20) NOT NULL,
    OFICINA VARCHAR(20) NOT NULL,
    BANCANDES VARCHAR2(50) NOT NULL,
    CONSTRAINT GerenteOficina_PK PRIMARY KEY (LOGIN),
    CONSTRAINT UsuarioGerenteOficina_FK FOREIGN KEY (LOGIN) 
        REFERENCES Usuario(LOGIN),
    CONSTRAINT OficinaGerenteOficina_FK FOREIGN KEY (OFICINA) 
        REFERENCES Oficina(NOMBRE),
    CONSTRAINT BancAndesGerenteOficina_FK FOREIGN KEY (BANCANDES) 
        REFERENCES BancAndes(NOMBRE_BANCO)
);

CREATE TABLE GerenteGeneral
(	LOGIN VARCHAR(20) NOT NULL,
    OFICINA VARCHAR(20) NOT NULL,
    BANCANDES VARCHAR2(50) NOT NULL,
    CONSTRAINT GerenteGeneral_PK PRIMARY KEY (LOGIN),
    CONSTRAINT UsuarioGerenteGeneral_FK FOREIGN KEY (LOGIN) 
        REFERENCES Usuario(LOGIN),
    CONSTRAINT OficinaGerenteGeneral_FK FOREIGN KEY (OFICINA) 
        REFERENCES Oficina(NOMBRE),
    CONSTRAINT BancAndesGerenteGeneral_FK FOREIGN KEY (BANCANDES) 
        REFERENCES BancAndes(NOMBRE_BANCO)
);

-- Creaaci�n de la tabla de Cuenta y las tablas de sus subclases
CREATE TABLE Cuenta
(   ID NUMBER NOT NULL,
    TIPO VARCHAR(20) NOT NULL,
    ESTADO VARCHAR(20) NOT NULL,
    SALDO NUMBER NOT NULL,
    FECHA_DE_CREACION DATE NOT NULL,
    OFICINA VARCHAR(20) NOT NULL,
    GERENTE_OFICINA VARCHAR(20) NOT NULL,
    CAJERO_FUNCIONARIO VARCHAR(20) NOT NULL,
    CLIENTE VARCHAR(20) NOT NULL,
    BANCANDES VARCHAR(50) NOT NULL,
    CONSTRAINT Cuenta_PK PRIMARY KEY (ID),
    CONSTRAINT OficinaCuenta_FK FOREIGN KEY (OFICINA)
        REFERENCES Oficina(NOMBRE),
    CONSTRAINT GerenteOficinaCuenta_FK FOREIGN KEY (GERENTE_OFICINA)
        REFERENCES GerenteOficina(LOGIN),
    CONSTRAINT CajeroFuncionarioCuenta_FK FOREIGN KEY (CAJERO_FUNCIONARIO)
        REFERENCES CajeroFuncionario(LOGIN),
    CONSTRAINT ClienteCuenta_FK FOREIGN KEY (CLIENTE)
        REFERENCES Cliente(LOGIN),
    CONSTRAINT BancAndesCuenta_FK FOREIGN KEY (BANCANDES)
        REFERENCES BancAndes(NOMBRE_BANCO)
);

CREATE TABLE CDT
(   ID NUMBER NOT NULL,
    FECHA_VENCIMIENTO DATE NOT NULL,
    TASA_DE_RENDIMIENTOS NUMBER NOT NULL,
    ESTADO VARCHAR(20) NOT NULL,
    CONSTRAINT CDT_PK PRIMARY KEY (ID),
    CONSTRAINT CuentaCDT_FK FOREIGN KEY (ID)
        REFERENCES Cuenta(ID)
);

CREATE TABLE AFC
(   ID NUMBER NOT NULL,
    CONSTRAINT AFC_PK PRIMARY KEY (ID),
    CONSTRAINT CuentaAFC_FK FOREIGN KEY (ID)
        REFERENCES Cuenta(ID)
);

CREATE TABLE DepositoDeInversion
(   ID NUMBER NOT NULL,
    CONSTRAINT DepositoDeInverison_PK PRIMARY KEY (ID),
    CONSTRAINT CuentaDepositoDeInversion_FK FOREIGN KEY (ID)
        REFERENCES Cuenta(ID)
);

CREATE TABLE Ahorros
(   ID NUMBER NOT NULL,
    CONSTRAINT Ahorros_PK PRIMARY KEY (ID),
    CONSTRAINT CuentaAhorros_FK FOREIGN KEY (ID)
        REFERENCES Cuenta(ID)
);

CREATE TABLE Corriente
(   ID NUMBER NOT NULL,
    CONSTRAINT Corriente_PK PRIMARY KEY (ID),
    CONSTRAINT CuentaCorriente_FK FOREIGN KEY (ID)
        REFERENCES Cuenta(ID)
);

-- Creaaci�n de la tabla Prestamo y especificaci�n de sus restricciones
CREATE TABLE Prestamo
(   ID NUMBER NOT NULL,
    INTERES NUMBER NOT NULL,
    NUM_CUOTAS NUMBER NOT NULL,
    DIA_A_PAGAR_CUOTA DATE NOT NULL,
    VALOR_CUOTA NUMBER NOT NULL,
    SALDO_PENDIENTE NUMBER NOT NULL,
    CUENTA NUMBER NOT NULL,
    CONSTRAINT Prestamo_PK PRIMARY KEY (ID),
    CONSTRAINT CuentaPrestamo_FK FOREIGN KEY (CUENTA)
        REFERENCES Cuenta(ID)
);

-- Creaaci�n de la tabla de OperacionBancaria y las tablas de sus subclases
CREATE TABLE OperacionBancaria
(   NUMERO_OPERACION NUMBER NOT NULL,
    VALOR NUMBER NOT NULL,
    HORA TIMESTAMP NOT NULL,
    FECHA DATE NOT NULL,
    CUENTA NUMBER NOT NULL,
    PUESTO_ATENCION NUMBER NOT NULL,
    PRESTAMO NUMBER NOT NULL,
    CONSTRAINT OperacionBancaria_PK PRIMARY KEY (NUMERO_OPERACION),
    CONSTRAINT CuentaOperacionBancaria_FK FOREIGN KEY (CUENTA)
        REFERENCES Cuenta(ID),
    CONSTRAINT PuestosDeAtencionOperacionBancaria_FK FOREIGN KEY (PUESTO_ATENCION) 
        REFERENCES PuestosDeAtencion(ID),
    CONSTRAINT PrestamoOperacionBancaria_FK FOREIGN KEY (PRESTAMO) 
        REFERENCES Prestamo(ID)
);

CREATE TABLE Intercuentas
(   ID NUMBER NOT NULL,
    TIPO VARCHAR(20) NOT NULL,
    CUENTA_RELACIONADA NUMBER NOT NULL,
    CONSTRAINT Intercuentas_PK PRIMARY KEY (ID),
    CONSTRAINT Intercuentas_FK FOREIGN KEY (CUENTA_RELACIONADA)
        REFERENCES Intercuentas(ID)
);

CREATE TABLE Unicuenta
(   ID NUMBER NOT NULL,
    TIPO VARCHAR(20) NOT NULL,
    CONSTRAINT Unicuenta PRIMARY KEY (ID),
    CONSTRAINT OperacionBancariaUnicuenta_FK FOREIGN KEY (ID)
        REFERENCES OperacionBancaria(NUMERO_OPERACION)
);

-- Creaaci�n de la tabla Dividendo y especificaci�n de sus restricciones
CREATE TABLE Dividendo
(   ID NUMBER NOT NULL,
    CLIENTE VARCHAR(20) NOT NULL,
    ACCION NUMBER NOT NULL,
    CONSTRAINT Dividendo_PK PRIMARY KEY (ID),
    CONSTRAINT ClienteDividendo_FK FOREIGN KEY (CLIENTE)
        REFERENCES Cliente(LOGIN),
    CONSTRAINT AccionDividendo_FK FOREIGN KEY (ACCION)
        REFERENCES Accion(ID)
);

COMMIT;

