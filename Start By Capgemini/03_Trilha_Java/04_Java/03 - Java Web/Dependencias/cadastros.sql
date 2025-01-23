-- Criação do banco de dados
CREATE DATABASE cadastros;

--criação da tabela
CREATE TABLE funcionario (
   id SERIAL PRIMARY KEY,
   nome VARCHAR(50),
   sobrenome VARCHAR(50),
   email VARCHAR(50),
   contato VARCHAR(15)
);

--Populando o banco
INSERT INTO funcionario (nome, sobrenome, email, contato) VALUES
('João', 'Silva', 'joao.silva@example.com', '11987654321'),
('Maria', 'Oliveira', 'maria.oliveira@example.com', '21987654321'),
('Pedro', 'Santos', 'pedro.santos@example.com', '31987654321'),
('Ana', 'Costa', 'ana.costa@example.com', '41987654321'),
('Lucas', 'Pereira', 'lucas.pereira@example.com', '51987654321'),
('Mariana', 'Ferreira', 'mariana.ferreira@example.com', '61987654321'),
('Gabriel', 'Almeida', 'gabriel.almeida@example.com', '71987654321'),
('Isabela', 'Nascimento', 'isabela.nascimento@example.com', '81987654321'),
('Rafael', 'Lima', 'rafael.lima@example.com', '91987654321'),
('Carla', 'Barros', 'carla.barros@example.com', '21912345678');

-- Consultar todos os dados da tabela
SELECT * FROM funcionario;