/*Usuários*/
 INSERT INTO Usuario ( nome, email, senha, dataNascimento, genero, preferenciaNotificacao) VALUES
 ( 'Ana Silva', 'ana.silva@gmail.com', 'senha_hash1', '1995-05-10', 'Feminino', TRUE),
 ( 'Beatriz Costa', 'beatriz.costa@email.com', 'senha_hash2', '1998-08-22', 'Feminino', TRUE),
 ( 'Carla Souza', 'carla.souza@email.com', 'senha_hash3', '2001-01-15', 'Feminino', FALSE),
 ( 'Diana Martins', 'diana.martins@email.com', 'senha_hash4', '1992-11-30', 'Feminino', TRUE),
 ( 'Erica Lima', 'erica.lima@email.com', 'senha_hash5', '1997-03-05', 'Feminino', FALSE);

/*Ciclo Menstrual*/
 INSERT INTO CicloMenstrual (usuario_id, dataInicio, duracaoCiclo, duracaoMenstruacao) VALUES
 ( 1, '2025-09-01', 28, 5),
 ( 2, '2025-08-05', 27, 4),
 ( 3, '2025-09-10', 30, 6),
 ( 4, '2025-09-12', 29, 5),
 ( 5, '2025-09-08', 26, 3);

/*Registro Diário*/
 INSERT INTO RegistroDiario ( usuario_id, data, humor, emocoes, sintomas, doencas) VALUES
 ( 1, '2025-09-01', 'Cansada', '{"emocao":"tristeza"}', '{"sintoma":"dor de cabeça"}', '{"doença":"nenhuma"}'),
 ( 2, '2025-09-11', 'Feliz', '{"emocao":"alegria"}', '{"sintoma":"nenhum"}', '{"doença":"nenhuma"}'),
 ( 3, '2025-09-13', 'Estressada', '{"emocao":"raiva"}', '{"sintoma":"cólicas"}', '{"doença":"nenhuma"}'),
 ( 4, '2025-09-09', 'Ansiosa', '{"emocao":"ansiedade"}', '{"sintoma":"inchaço"}', '{"doença":"nenhuma"}'),
 ( 5, '2025-09-06', 'De boa', '{"emocao":"calma"}', '{"sintoma":"espinhas"}', '{"doença":"nenhuma"}');

/*Métodos Contraceptivos*/
 INSERT INTO MetodoContraceptivo ( usuario_id, nome, tipo, eficacia, descricao) VALUES
 (1, 'Pílula anticoncepcional', 'Oral', 0.99, 'Uso diário para prevenir a gravidez.'),
 (2, 'DIU de Cobre', 'Intrauterino', 0.99, 'Dispositivo inserido no útero que libera cobre.'),
 (3, 'Adesivo', 'Transdérmico', 0.91, 'Adesivo que libera hormônios, trocado semanalmente.'),
 (4, 'Injeção', 'Injetável', 0.94, 'Injeção de hormônios aplicada a cada 1 ou 3 meses.'),
 (5, 'Preservativo', 'Barreira', 0.85, 'Método que impede a entrada de esperma no útero.');

/*Informação Saúde*/
 INSERT INTO InformacaoSaude ( titulo, conteudo, categoria, tags) VALUES
 ( 'O que é TPM?', 'Conteúdo sobre a Síndrome Pré-Menstrual, seus sintomas e como aliviá-los.', 'TPM', '{"tags":["sintomas","humor","saúde feminina"]}'),
 ( 'Alimentação durante o ciclo', 'Dicas de alimentos que ajudam a aliviar cólicas e outros desconfortos.', 'Alimentação', '{"tags":["nutrição","cólicas","saúde"]}'),
 ( 'Como usar o DIU corretamente', 'Guia completo sobre a inserção, cuidados e possíveis efeitos do DIU.', 'Métodos Contraceptivos', '{"tags":["DIU","hormônios","planejamento familiar"]}'),
 ( 'Identificando sangramentos anormais', 'Informações sobre o que pode ser considerado um sangramento de alerta.', 'Saúde Sexual', '{"tags":["sangramento","sintomas","ginecológico"]}'),
 ( 'Benefícios do autoconhecimento', 'Artigo sobre como o autoconhecimento pode influenciar a saúde sexual.', 'Psicologia', '{"tags":["autoconhecimento","sexualidade","saúde mental"]}');