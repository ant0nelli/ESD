# Questões para Responder na Entrega:
## 1. Por que essa abordagem usando um array de instâncias da classe Vetor torna a busca de um contato mais rápida em comparação com a versão anterior (uma única lista contendo todos os contatos)?

Pois é possível pular direto para a letra necessária, ao querer procurar uma palavra em um dicionário com 240.000 palavras e a palavra é Zebra, com essa abordagem é possível pular direto para a letra Z, pulando todas as anteriores

## 2. O que acontece com o desempenho da busca se a maioria dos contatos cadastrados começar com a mesma letra (ex: centenas de nomes iniciando com a letra "M")? O sistema continuará rápido? Justifique.

Quanto mais concentrado em uma letra mais o sistema começaria a se aproximar da eficiência da busca linear normal. Ao ter todos os nomes na mesma letra ele seria igual a fazer uma busca linear