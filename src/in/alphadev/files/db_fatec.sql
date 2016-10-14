USE db_fatec;
CREATE TABLE IF NOT EXISTS `contatos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `sexo` char(1) NOT NULL DEFAULT 'M',
  `fone_res` varchar(15) NOT NULL,
  `fone_cel` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `data_nas` date NOT NULL,
  `salario` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

create table if not exists `usuarios` (
    `id` int(11) not null AUTO_INCREMENT,
    `nome` varchar(40) not null,
    `usuario` varchar(15) not null,
    `senha` varchar(15) not null,
    `nivel` varchar(15),
    `tema`  varchar(50),
    `email` varchar(50),
    `create_at` timestamp,
    `update_at` timestamp,
    `delete_at` timestamp,
    
    PRIMARY key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;
