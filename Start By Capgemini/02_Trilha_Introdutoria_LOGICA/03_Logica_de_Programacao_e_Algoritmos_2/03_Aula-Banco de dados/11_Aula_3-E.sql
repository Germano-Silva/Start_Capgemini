-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/07/2024 às 03:11
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
-- Estrutura para tabela `produtos`
--

CREATE TABLE `produtos` (
  `ID` int(11) NOT NULL,
  `DESCRICAO` varchar(100) NOT NULL,
  `QTD_ESTOQUE` float NOT NULL,
  `PRECO` float NOT NULL,
  `CATEGORIA_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produtos`
--

INSERT INTO `produtos` (`ID`, `DESCRICAO`, `QTD_ESTOQUE`, `PRECO`, `CATEGORIA_ID`) VALUES
(1, 'Arroz Branco', 100, 2.5, 7),
(2, 'Feijão Preto', 50, 1.8, 7),
(3, 'Leite Integral', 200, 3.2, 4),
(4, 'Pão Francês', 150, 1.5, 3),
(5, 'Café Solúvel', 300, 5, 1),
(6, 'Suco de Laranja', 100, 4.5, 2),
(7, 'Carne de Boi', 50, 15, 5),
(8, 'Frango Congelado', 100, 8, 5),
(9, 'Maçã', 200, 3, 6),
(10, 'Banana', 300, 1.2, 6),
(11, 'Shampoo', 150, 10, 8),
(12, 'Condicionador', 100, 12, 8),
(13, 'Detergente', 200, 5.5, 9),
(14, 'Sabonete', 300, 2.8, 9),
(15, 'Ração para Cachorro', 100, 20, 10),
(16, 'Ração para Gato', 50, 15, 10),
(17, 'Queijo Coalho', 150, 12, 4),
(18, 'Iogurte Natural', 200, 4, 4),
(19, 'Bolacha de Chocolate', 300, 2, 3),
(20, 'Torta de Frutas', 100, 15, 3);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `CATEGORIA_ID` (`CATEGORIA_ID`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`CATEGORIA_ID`) REFERENCES `categorias` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
