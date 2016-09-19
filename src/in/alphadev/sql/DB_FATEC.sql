-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 16-Set-2016 às 22:44
-- Versão do servidor: 5.7.14
-- PHP Version: 5.5.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `DB_FATEC`
--
CREATE DATABASE IF NOT EXISTS `DB_FATEC` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `DB_FATEC`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda`
--

DROP TABLE IF EXISTS `agenda`;
CREATE TABLE IF NOT EXISTS `agenda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  `sexo` varchar(1) NOT NULL DEFAULT 'M',
  `fone_res` varchar(15) DEFAULT NULL,
  `fone_cel` varchar(15) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `data_nas` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `salario` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Cadastro de Contatos';

--
-- Extraindo dados da tabela `agenda`
--

INSERT INTO `agenda` (`id`, `nome`, `sexo`, `fone_res`, `fone_cel`, `email`, `data_nas`, `salario`) VALUES
(1, 'Fernando Salles Claro', 'M', '(12) 555-1234', '(12) 9999-5678', 'contato@alphadev.in', '2016-09-16 22:44:00', 1000),
(2, 'Fernando Salles Claro', 'M', '(12) 555-1234', '(12) 9999-5678', 'contato@alphadev.in', '2016-09-16 22:44:03', 1000);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  `nivel` varchar(20) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tema` varchar(50) NOT NULL DEFAULT 'com.jtattoo.plaf.aluminium.AluminiumLookAndFeel',
  `dtcadastro` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Cadastro de Usuário';

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `nivel`, `usuario`, `senha`, `email`, `tema`, `dtcadastro`) VALUES
(1, 'Administrador', 'administrador', 'admin', '123', 'admin@gmail.com', 'com.jtattoo.plaf.aluminium.AluminiumLookAndFeel', '2016-09-16 19:13:53'),
(2, 'Operador', 'operador', 'operador', 'abc', 'operador@gmail.com', 'com.jtattoo.plaf.aluminium.AluminiumLookAndFeel', '2016-09-16 19:14:40');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
