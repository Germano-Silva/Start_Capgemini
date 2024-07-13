-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/07/2024 às 03:53
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
-- Estrutura para tabela `categorias`
--

CREATE TABLE `categorias` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `categorias`
--

INSERT INTO `categorias` (`ID`, `NOME`) VALUES
(1, 'ALIMENTOS'),
(2, 'BEBIDAS'),
(3, 'PADARIA E CONFEITARIA'),
(4, 'LATICÍNIOS'),
(5, 'CARNES E AVES'),
(6, 'HORTIFRUTI'),
(7, 'MERCEARIA'),
(8, 'PERFUMARIA E COSMÉTICOS'),
(9, 'LIMPEZA E HIGIENE'),
(10, 'PET SHOP');

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

-- --------------------------------------------------------

--
-- Estrutura para tabela `vendas`
--

CREATE TABLE `vendas` (
  `ID` int(11) NOT NULL,
  `DATA_VENDA` date NOT NULL,
  `CLIENTE_ID` int(11) NOT NULL,
  `TOTAL_VENDA` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `vendas`
--

INSERT INTO `vendas` (`ID`, `DATA_VENDA`, `CLIENTE_ID`, `TOTAL_VENDA`) VALUES
(1, '2024-07-09', 1, 100);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `itens_vendas`
--
ALTER TABLE `itens_vendas`
  ADD PRIMARY KEY (`ID_PRODUTO`,`ID_VENDA`),
  ADD KEY `ID_VENDA` (`ID_VENDA`);

--
-- Índices de tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `CATEGORIA_ID` (`CATEGORIA_ID`);

--
-- Índices de tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `CLIENTE_ID` (`CLIENTE_ID`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categorias`
--
ALTER TABLE `categorias`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `itens_vendas`
--
ALTER TABLE `itens_vendas`
  ADD CONSTRAINT `itens_vendas_ibfk_1` FOREIGN KEY (`ID_VENDA`) REFERENCES `vendas` (`ID`),
  ADD CONSTRAINT `itens_vendas_ibfk_2` FOREIGN KEY (`ID_PRODUTO`) REFERENCES `produtos` (`ID`);

--
-- Restrições para tabelas `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`CATEGORIA_ID`) REFERENCES `categorias` (`ID`);

--
-- Restrições para tabelas `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`CLIENTE_ID`) REFERENCES `clientes` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
