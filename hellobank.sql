-- Criando o Banco de Dados hellobank
CREATE DATABASE  IF NOT EXISTS `hellobank`;

USE `hellobank`;

-- Criação e inserção de dados na tabela de Usuários
CREATE TABLE `usuario` (
	`id_usuario` int NOT NULL AUTO_INCREMENT,
	`nome_usuario` varchar(10) NOT NULL,
    `senha_usuario` varchar(10) NOT NULL,
    PRIMARY KEY (id_usuario)
);
LOCK TABLES `usuario` WRITE;
INSERT INTO `usuario` VALUES 
	(1,'Usuario','1234');
UNLOCK TABLES;

-- Criação e inserção de dados na tabela de Endereços
CREATE TABLE `endereco` (
  `id_endereco` int NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(150) NOT NULL,
  `numero_endereco` varchar(7) NOT NULL,
  `bairro` varchar(60) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `cep` varchar(9) NOT NULL,
  PRIMARY KEY (`id_endereco`)
);
LOCK TABLES `endereco` WRITE;
INSERT INTO `endereco` VALUES 
	(1,'Rua 7 de setembro','45','Santo Amaro','Salvador','BA','67455-458'),
	(2,'Avenida 25 de março','785B','Bonfim','Rio Branco','AC','45632-123'),
	(3,'Rua das flores','125','Amaralina','Rio de Janeiro','RJ','89455-458'),
	(4,'Avenida Marechal Deodoro','S/N','Teotônio Vilela','Maceió','AL','52455-658'),
	(5,'Rua D. Pedro II','98765','Savóia','Sapetinga','RS','78955-658'),
	(6,'Avenida Soares Lopes','489A','Corais','Santo André','SP','36955-968'),
	(7,'Rua Machado de Assis','62','Joanes de Sá','Manaus','AM','65485-658'),
	(8,'Avenida Góes Farias','258','Tento','Porto Seguro','BA','69855-658'),
	(9,'Rua Paulo Lima','741','Bolivia','Paraíso','MS','37955-658'),
	(10,'Rua 15 de novembro','S/N','Teotônio Vilela','Maceió','AL','32455-658');
UNLOCK TABLES;

-- Criação e inserção de dados na tabela de Clientes
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(90) NOT NULL,
  `email_cliente` varchar(50) NOT NULL,
  `telefone_cliente` varchar(20) NOT NULL,
  `cpf_cliente` varchar(15) NOT NULL,
  `endereco_cliente` int NOT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `fk_EndCli` (`endereco_cliente`),
  CONSTRAINT `fk_EndCli` FOREIGN KEY (`endereco_cliente`) REFERENCES `endereco` (`id_endereco`)
);
LOCK TABLES `cliente` WRITE;
INSERT INTO `cliente` VALUES 
	(1,'Cristina Almeida Santos','cristina@gmail.com','(12)32145-7896','456.578.123-12',1),
	(2,'Alexandre Moraes Vieira','alexandre@gmail.com','(51)83145-7896','831.478.123-21',2),
	(3,'Luciana Martins Costa','luciana@gmail.com','(78)59145-7896','591.978.123-78',3),
	(4,'Marcos Santana Farias','marcos@gmail.com','(39)96745-7896','967.978.123-53',3),
	(5,'Bruno Souza Santos','bruno@gmail.com','(63)73145-7896','731.978.123-85',4),
	(6,'Mirian Santana Silva','miriam@gmail.com','(89)23945-7896','239.978.123-14',5),
	(7,'Paulo Santana Farias','paulo@gmail.com','(68)56845-7896','568.978.123-51',6),
	(8,'Danielle Braga Pinheiro','danielle@gmail.com','(45)18745-7896','187.978.123-98',7),
	(9,'Vivian Silva Souza','vivian@gmail.com','(85)64845-7896','648.978.123-62',8),
	(10,'Caroline Rocha Oliveira','caroline@gmail.com','(78)52845-7896','528.978.123-46',10),
	(11,'Vinicius Cardoso Pereira','vinicius@gmail.com','(37)67543-9148','414.824.310-33',9);
UNLOCK TABLES;

-- Criação e inserção de dados na tabela de Contas
CREATE TABLE `conta` (
  `id_conta` int NOT NULL AUTO_INCREMENT,
  `agencia_conta` int NOT NULL,
  `numero_conta` int NOT NULL,
  `saldo` double DEFAULT NULL,
  `id_cliente` int DEFAULT NULL,
  PRIMARY KEY (`id_conta`),
  KEY `fk_ContCli` (`id_cliente`),
  CONSTRAINT `fk_ContCli` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
);
LOCK TABLES `conta` WRITE;
INSERT INTO `conta` VALUES
	(1,3245,98765,1.5,1),
    (2,2345,81765,4.7,3),
    (3,4145,72765,800,6),
    (4,5945,63765,12.5,9),
    (5,6845,54765,8.2,2),
    (6,7745,45765,14.35,4),
    (7,8645,36765,34.59,7),
    (8,9545,27765,1.128,5),
    (9,1445,18765,6.7,8),
    (10,2345,99765,4.9,10);
UNLOCK TABLES;

-- Criação e inserção de dados na tabela Transações
CREATE TABLE `transacao` (
	`id_transacao` int NOT NULL AUTO_INCREMENT,
    `conta_origem` int,
    `conta_destino` int NOT NULL,
    `valor_transacao` float NOT NULL,
    `data_transacao` varchar(10) NOT NULL,
    `tipo_transacao` varchar(15),
    PRIMARY KEY (`id_transacao`),
    KEY `fk_CliOrigin` (`conta_origem`),
	CONSTRAINT `fk_CliOrigin` FOREIGN KEY (`conta_origem`) REFERENCES `conta` (`id_conta`),
	KEY `fk_CliDest` (`conta_destino`),
	CONSTRAINT `fk_CliDest` FOREIGN KEY (`conta_destino`) REFERENCES `conta` (`id_conta`)
);
LOCK TABLES `transacao` WRITE;
INSERT INTO `transacao` VALUES
	(1,1,5,75.9,'15/09/2022','pix'),
    (2,10,3,75.9,'13/06/2022','transferência'),
    (3,2,9,75.9,'01/04/2022','Pagamento'),
    (4,7,4,75.9,'27/02/2022','transferência'),
    (5,8,2,75.9,'30/08/2022','pix'),
    (6,null,6,100.0,'19/09/2022','deposito');
UNLOCK TABLES;
