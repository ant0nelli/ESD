# Atividades

### Atividades00

**Exercício 1 — Funcionário, Gerente e Projeto**
Modelar um pequeno sistema de gestão de projetos com as classes `Funcionario`, `Gerente` e `Projeto`:
- `Funcionario` tem nome, projeto, salário e um indicador de projeto finalizado. Ao finalizar o projeto, recebe um bônus de 10% sobre o salário.
- `Gerente` tem os mesmos dados de um funcionário, além da quantidade de funcionários supervisionados. Sua remuneração soma ao salário base um bônus de 1% por funcionário supervisionado, mais o bônus de 10% quando o projeto é concluído.
- `Projeto` agrupa um gerente e uma lista de funcionários, calcula o custo total (soma das remunerações) e permite finalizar o projeto, propagando o status para gerente e equipe.

**Exercício 2 — Diagrama UML: Imóveis**
Criar um diagrama de classes (UML) para um sistema de locação de imóveis, com as entidades `Cliente`, `Imovel`, `ContratoLocacao` e uma classe de aplicação (`App`) que consulta detalhes de contratos e histórico de locações por cliente. O diagrama está em `Atividade2/src/main/java/ads/esd/README.md` (formato Mermaid).

**Exercício 3 — Modelagem de classes (arquivos .txt)**
Modelar, em pseudocódigo (sem implementar em Java), a estrutura de atributos e métodos (inicialização, modificação e consulta) de sete classes distintas:
- `Pessoa` (nome, nascimento, CPF);
- `Aluno` (estende Pessoa; matrícula e curso);
- `ContaBancaria` (estende Pessoa; id e saldo);
- `Circulo` (raio, com métodos para diâmetro, área e circunferência);
- `Filme` (título, diretor, produtora, ano de lançamento, duração);
- `Livro` (autor, título, editora, ISBN, ano de publicação);
- `ItemEstoque` (id, nome, quantidade).

### Agenda
Criação de uma agenda telefônica utilizando array estático e, posteriormente, adaptando para array dinâmico.

Funções:
- **Adicionar contato:** inserir um novo contato na agenda, respeitando as regras de não repetição;
- **Remover contato:** excluir um contato existente;
- **Buscar contato:** localizar um contato pelo nome ou telefone;
- **Atualizar contato:** modificar os dados de um contato já cadastrado;
- **Listar contatos:** mostrar todos os contatos armazenados;
- **Manipulação em lote:** inserir vários contatos de uma vez;
- **Buscar por prefixo** (ex.: todos os nomes que começam com "Ana") — dica: método `startsWith` da classe `String`.

### Vetor Lista
Implementação de uma estrutura de "vetor de listas" (`VetorDeLista`), que organiza nomes em 26 vetores estáticos, um para cada letra do alfabeto — o nome é inserido no vetor correspondente à sua primeira letra. Demonstra como combinar vetores estáticos para indexar dados por categoria.