BEGIN TRANSACTION;
CREATE TABLE Cliente(cpf TEXT PRIMARY KEY,nome TEXT,endereco TEXT, telefone TEXT);
CREATE TABLE Compra (codFornecedor TEXT, data TEXT, id INTEGER PRIMARY KEY);
CREATE TABLE Fornecedor(cnpj TEXT PRIMARY KEY,nome TEXT,endereco TEXT, telefone TEXT);
CREATE TABLE Item(codigo INTEGER PRIMARY KEY, nome TEXT, precoCusto REAL,margemLucro REAL,quant INTEGER);
CREATE TABLE ItemCompra(CompraID INTEGER ,codItem INTEGER, precoCompra REAL, quant INTEGER,PRIMARY KEY(compraID,codItem),FOREIGN KEY(codItem) REFERENCES Item(codigo));
CREATE TABLE ItemPedido(pedidoID INTEGER ,codItem INTEGER, precoPedido REAL, quant INTEGER,PRIMARY KEY(pedidoID,codItem),FOREIGN KEY(codItem) REFERENCES Item(codigo));
CREATE TABLE Pedido (codCliente TEXT, data TEXT, id INTEGER PRIMARY KEY);
COMMIT;
