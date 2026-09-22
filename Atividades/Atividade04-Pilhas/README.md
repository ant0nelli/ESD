## Questões

### Durante a execução, observe o comportamento da pilha. Explique, com suas palavras, o que acontece com a pilha quando o algoritmo:
#### 1. Encontra uma nova posição que pode ser explorada;
A pilha recebe a nova posição
#### 2. Chega a um caminho sem saída;
A pilha "remove" esse caminho 
#### 3. Precisa retornar a uma bifurcação;
A pilha vai "removendo" os caminhos até achar uma posição que há outra opção para ser explorada
#### 4. Encontra o destino.
Guarda a posição de destino

#### Por fim, considerando um labirinto com L linhas e C colunas, determine a complexidade de tempo do
algoritmo no pior caso e justifique sua resposta.
A complexidade seria O(L x C), e o pior caso seria se não houve um T e fosse necessário percorrer todos os espaços vazios.