CREATE DATABASE LivrariaSESISENAI;
-- Criado o Banco de Dados LivrariaSESISENAI

USE LivrariaSESISENAI;


CREATE TABLE tb_cliente(
id_cliente int PRIMARY KEY NOT NULL,
nome varchar(30) NOT NULL,
rg varchar(11) NOT NULL,
cpf varchar(11) NOT NULL,
email varchar(45) NOT NULL
);


CREATE TABLE tb_cliente_telefone(
id_telefone int PRIMARY KEY NOT NULL,
telefone varchar(15) NOT NULL
);


CREATE TABLE tb_cliente_endereco(
id_endereco int PRIMARY KEY NOT NULL,
rua varchar(45) NOT NULL,
numero int NOT NULL,
cidade varchar(45) NOT NULL,
estado varchar(45) NOT NULL
);

CREATE TABLE tb_pedidos(
id_pedido int PRIMARY KEY NOT NULL,
valor decimal (10,2) NOT NULL,
dat4 DATE NOT NULL,
Cliente_id_cliente int NOT NULL
);

CREATE TABLE tb_item_pedido(
quantidade int NOT NULL,
valor decimal(10,2) NOT NULL
);

CREATE TABLE tb_livro(
id_livro int PRIMARY KEY NOT NULL,
titulo varchar(45) NOT NULL,
categoria varchar(45) NOT NULL,
isbn varchar(13) NOT NULL,
ano year NOT NULL,
valor DECIMAL(10,2) NOT NULL,
autor varchar(30) NOT NULL
);

CREATE TABLE tb_estoque(
quantidade int NOT NULL
);

CREATE TABLE tb_editora(
id_editora int PRIMARY KEY NOT NULL,
nome_editora varchar(45) NOT NULL,
nome_contato varchar(45) NOT NULL,
email varchar(45) NOT NULL,
contato varchar(30) NOT NULL
);