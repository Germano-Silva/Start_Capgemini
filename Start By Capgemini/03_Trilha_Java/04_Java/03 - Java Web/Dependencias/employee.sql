-- Database: employee

-- DROP DATABASE IF EXISTS employee;

CREATE DATABASE employee
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE employee
    IS 'Teste';

CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    username VARCHAR(250),
    password VARCHAR(20),
    address VARCHAR(45),
    contact VARCHAR(45)
);

SELECT * FROM employee;