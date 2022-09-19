# Projeto HelloBank - Grupo 7

> Status: ⚠🔧 Em Desenvolvimento 🔨⚠
<br>

<img src="https://user-images.githubusercontent.com/66737556/190678385-3f80de8a-ca48-494e-acb5-273bcc50e45f.png" alt="Tela login">
<br>

> ## 🤝 Colaboradores

As pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/katrynribeiro" target="_blank">
        <img src="https://avatars.githubusercontent.com/u/103230282?v=4" width="100px;" alt="Foto da Katryn Ribeiro no GitHub"/> <br>
        <sub><b> Katryn Ribeiro </b></sub> <br>
        <sub><i> BD + FrontEnd </sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/rflsza13" target="_blank">
        <img src="https://user-images.githubusercontent.com/66737556/191072857-75f04780-2fb3-4018-aebb-403abeb2ff86.jpg" width="100px;"alt="Foto do Rafael Souza no GitHub"/> <br>
        <sub><b> Rafael Souza </b></sub> <br>
        <sub><i> BackEnd </i></sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/wvitorsj" target="_blank">
        <img src="https://avatars.githubusercontent.com/u/74933042?v=4" width="100px;" alt="Foto do Vitor Silva no GitHub"/> <br>
        <sub><b> Vitor Silva </b></sub> <br>
        <sub><i> DevOps </i></sub> <br>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars3.githubusercontent.com/u/31936044" width="100px;" alt="Foto da Jeisiane França no GitHub"/><br>
        <sub>
          <b> Jeisiane França </b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars3.githubusercontent.com/u/31936044" width="100px;" alt="Foto do Eduardo Santos no GitHub"/><br>
        <sub>
          <b> Eduardo Santos </b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars3.githubusercontent.com/u/31936044" width="100px;" alt="Foto do Pedro Henrique no GitHub"/><br>
        <sub>
          <b> Pedro Henrique </b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<br>

> ## 💻 Tecnologias Usadas

Tecnologias usadas nesse projeto

<code>
  <img src="https://img.shields.io/badge/Git-E34F26?style=for-the-badge&logo=git&logoColor=white"/>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white"/>
  <img src="https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white"/>
  <img src="https://img.shields.io/badge/Jenkins-D33833?style=for-the-badge&logo=jenkins&logoColor=white"/>
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
  <img src="https://img.shields.io/badge/Amazon_AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white"/>
</code>

<br>
<br>
<br>

> ## 📓 Objetivo do Projeto
  Criação de uma API para para gerenciar as transações de um banco fictício, podendo efetuar o cadastro de novos clientes e contas, além de permitir a atualização e exclusão de cadastros já efetuados, além de listar as transações entre contas efetuadas.
  <ul> 
    <H3> Lista detalhada de funções: </H3>
    <ul>
      <li> Cadastro de Clientes </li>
      <li> Alteração de Clientes </li>
      <li> Listagem de Clientes </li>
      <li> Exclusão de Clientes </li>
      <br>
      <li> Cadastro de Contas </li>
      <li> Alteração de Contas </li>
      <li> Listagem de Contas </li>
      <li> Exclusão de Contas </li>
      <br>
      <li> Cadastro de Transações </li>
      <li> Listagem de Transações </li>
      <li> Exclusão de Transações </li>
    </ul>
  </ul>
  
<br>

> ## Endpoints

<br>

> ## Banco de Dados
 
 <h5> Criação da tabela de Endereços: </h5>
 
  ```
  CREATE TABLE `endereco` (
    `id_endereco` int NOT NULL AUTO_INCREMENT,
    `logradouro` varchar(150) NOT NULL,
    `numero_endereco` varchar(7) NOT NULL,
    `bairro` varchar(60) NOT NULL,
    `cidade` varchar(50) NOT NULL,
    `estado` varchar(2) NOT NULL,
    `cep` varchar(9) NOT NULL,
    PRIMARY KEY (`id_endereco`));
  ```
  <h5> Criação da tabela de Clientes: </h5>
  
  ```
  CREATE TABLE `cliente` (
    `id_cliente` int NOT NULL AUTO_INCREMENT,
    `nome_cliente` varchar(90) NOT NULL,
    `email_cliente` varchar(50) NOT NULL,
    `telefone_cliente` varchar(20) NOT NULL,
    `cpf_cliente` varchar(15) NOT NULL,
    `endereco_cliente` int NOT NULL,
    PRIMARY KEY (`id_cliente`),
    KEY `fk_EndCli` (`endereco_cliente`),
    CONSTRAINT `fk_EndCli` FOREIGN KEY (`endereco_cliente`) REFERENCES `endereco` (`id_endereco`));
  ```
  
  <h5> Criação da tabela de Contas: </h5>
  
  ```
    CREATE TABLE `conta` (
      `id_conta` int NOT NULL AUTO_INCREMENT,
      `agencia_conta` int NOT NULL,
      `numero_conta` int NOT NULL,
      `saldo` double DEFAULT NULL,
      `id_cliente` int DEFAULT NULL,
      PRIMARY KEY (`id_conta`),
      KEY `fk_ContCli` (`id_cliente`),
      CONSTRAINT `fk_ContCli` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`));
  ```
  
  <h5> Criação da tabela de Transações: </h5>
  
  ```
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
        CONSTRAINT `fk_CliDest` FOREIGN KEY (`conta_destino`) REFERENCES `conta` (`id_conta`));
  ```

<h3> Modelo Entidade-Relacionamento: </h3>
<img src="https://user-images.githubusercontent.com/66737556/190691890-1c7b4380-4040-4f24-9c9c-4cc89f67783e.png" alt="DER">
 
Script SQL: https://github.com/HelloBank-IBM7/HelloBank/files/9585892/hellobank.zip
