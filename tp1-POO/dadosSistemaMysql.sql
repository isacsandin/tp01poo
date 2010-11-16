BEGIN TRANSACTION;
CREATE TABLE Cliente(cpf varchar(15) PRIMARY KEY,nome varchar(20),endereco varchar(20), telefone varchar(20));
CREATE TABLE Compra ( id INT PRIMARY KEY AUTO_INCREMENT,codFornecedor varchar(20), data varchar(20));
CREATE TABLE Fornecedor(cnpj varchar(20) PRIMARY KEY,nome varchar(20),endereco varchar(20), telefone varchar(20));
CREATE TABLE Item(codigo INT PRIMARY KEY, nome varchar(20), precoCusto REAL,margemLucro REAL,quant INT);
CREATE TABLE ItemCompra(CompraID INT ,codItem INT, precoCompra REAL, quant INT,PRIMARY KEY(compraID,codItem),FOREIGN KEY(codItem) REFERENCES Item(codigo));
CREATE TABLE ItemPedido(pedidoID INT ,codItem INT, precoPedido REAL, quant INT,PRIMARY KEY(pedidoID,codItem),FOREIGN KEY(codItem) REFERENCES Item(codigo));
CREATE TABLE Pedido ( id INT PRIMARY KEY AUTO_INCREMENT,codCliente varchar(20), data varchar(20));
CREATE TABLE Users (name varchar(20) PRIMARY KEY,passwd varchar(30),admin varchar(5));
COMMIT;
