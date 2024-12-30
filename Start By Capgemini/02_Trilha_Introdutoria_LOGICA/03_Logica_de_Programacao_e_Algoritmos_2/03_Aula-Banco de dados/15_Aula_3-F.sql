-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/07/2024 às 03:52
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
-- Estrutura para tabela `itens_vendas`
--

CREATE TABLE `itens_vendas` (
  `ID_PRODUTO` int(11) NOT NULL,
  `ID_VENDA` int(11) NOT NULL,
  `VALOR_PRODUTO` float NOT NULL,
  `DESCONTO` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `itens_vendas`
--

INSERT INTO `itens_vendas` (`ID_PRODUTO`, `ID_VENDA`, `VALOR_PRODUTO`, `DESCONTO`) VALUES
(1, 1, 100, 10),
(3, 1, 10, 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `itens_vendas`
--
ALTER TABLE `itens_vendas`
  ADD PRIMARY KEY (`ID_PRODUTO`,`ID_VENDA`),
  ADD KEY `ID_VENDA` (`ID_VENDA`);

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `itens_vendas`
--
ALTER TABLE `itens_vendas`
  ADD CONSTRAINT `itens_vendas_ibfk_1` FOREIGN KEY (`ID_VENDA`) REFERENCES `vendas` (`ID`),
  ADD CONSTRAINT `itens_vendas_ibfk_2` FOREIGN KEY (`ID_PRODUTO`) REFERENCES `produtos` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
