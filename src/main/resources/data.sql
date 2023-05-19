INSERT INTO VENDEDOR(nome) VALUES ('Felippe');
INSERT INTO VENDEDOR(nome) VALUES('Loren');
INSERT INTO VENDEDOR(nome) VALUES('Douglas');

--INSERT INTO VENDA(valor, nome) VALUES ('1250', 'Felippe');

INSERT INTO VENDA(valor, vendedor_id) VALUES( 50.2, 1);
INSERT INTO VENDA(data_venda, valor, vendedor_id) VALUES('2022-12-02 10:32:00', 510.0, 2);
INSERT INTO VENDA(data_venda, valor, vendedor_id) VALUES('2022-12-02 10:33:00', 25.52, 3);