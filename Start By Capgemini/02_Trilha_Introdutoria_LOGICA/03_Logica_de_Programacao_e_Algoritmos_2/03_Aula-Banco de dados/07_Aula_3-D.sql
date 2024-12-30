-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/07/2024 às 01:50
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db_trainee`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  `CPF` char(11) NOT NULL,
  `DATANASCIMENTO` date NOT NULL,
  `EMAIL` varchar(70) NOT NULL,
  `ATIVO` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`ID`, `NOME`, `CPF`, `DATANASCIMENTO`, `EMAIL`, `ATIVO`) VALUES
(1, 'Ana Luiza Silva', '12345678901', '1992-03-15', 'ana.luiza@email.com', b'1'),
(2, 'João Pedro Oliveira', '98765432102', '1985-11-22', 'joao.pedro@email.com', b'0'),
(3, 'Maria Eduarda Santos', '45678901234', '1995-06-01', 'aria.eduarda@email.com', b'1'),
(4, 'Carlos Henrique Almeida', '65432109876', '1978-02-28', 'carlos.henrique@email.com', b'1'),
(5, 'Luana Beatriz Ferreira', '32109876543', '1990-08-12', 'luana.beatriz@email.com', b'0'),
(6, 'Pedro Henrique Silva', '09876543210', '1982-05-25', 'pedro.henrique@email.com', b'1'),
(7, 'Julia Cristina Martins', '765432.1098', '1997-01-18', 'julia.cristina@email.com', b'1'),
(8, 'Rafael Alexandre Souza', '10987654321', '1980-09-10', 'rafael.alexandre@email.com', b'0'),
(9, 'Gabriela Fernanda Costa', '54321098765', '1994-04-07', 'gabriela.fernanda@email.com', b'1'),
(10, 'Leonardo Augusto Dias', '87654321098', '1987-12-24', 'leonardo.augusto@email.com', b'1');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
