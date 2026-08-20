# Aulas

## Aula 01 — Revisão POO
Introdução ao conteúdo da disciplina e revisão de Programação Orientada a Objetos.

## Aula 02 — Vetor Estático
Implementação de um vetor estático (`VetorEstatico`) com tamanho fixo, contendo:
- Inserção em posição específica (com deslocamento dos elementos existentes);
- Remoção do último elemento;
- Tratamento de vetor cheio e de índice inválido.

## Aula 03 — Vetor Dinâmico
Implementação de um vetor dinâmico (`VetorDinamico`), que cresce e encolhe automaticamente:
- Inserção com expansão automática (dobra o tamanho quando enche);
- Remoção com redução automática (reduz pela metade quando ocupação cai a 1/4 da capacidade);
- Impressão dos elementos armazenados.

## Aula 04 — Generalização (Object e Generics)
Exploração de técnicas de generalização para criar estruturas de dados mais flexíveis:
- **Generalização via `Object`:** Criação da estrutura `VetorObjeto`, permitindo armazenar diferentes tipos de dados usando a superclasse do Java, porém exigindo *casting* e com menor segurança.
- **Generalização via `Generics`:** Implementação utilizando tipos genéricos (como nas classes `Vetor` e `Caixa`), garantindo a checagem de tipos em tempo de compilação (*type safety*) e eliminando a necessidade de conversões manuais. 
- Utilização de classes de teste como `Produto` para validar as implementações.

## Aula 05 — Inserção Ordenada e Dados Aleatórios
Aprimoramento das operações do vetor genérico (`Vetor`) construído anteriormente:
- **Inserção Ordenada:** Implementação de um algoritmo que, ao adicionar um novo item, já o insere na posição correta de ordenação, mantendo o vetor sempre organizado.
- **Geração Aleatória:** Criação de uma função para inserir elementos gerados de forma aleatória na estrutura, facilitando a realização de testes com um volume maior de dados.