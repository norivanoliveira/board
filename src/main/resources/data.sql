INSERT INTO USUARIO(nome, email, senha) VALUES('Primeiro membro', 'membro@email.com', '123456');

INSERT INTO CURSO(nome, categoria) VALUES('Freios', 'Carros');
INSERT INTO CURSO(nome, categoria) VALUES('Eletrica', 'Carros');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Teste 1', 'Teste 1', '2021-05-05 18:00:00', 1, 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Teste 2', 'Teste 2', '2021-05-05 19:00:00', 1, 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Teste 3', 'Teste 3', '2021-05-05 20:00:00', 1, 1, 2);