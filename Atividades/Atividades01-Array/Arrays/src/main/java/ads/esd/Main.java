package ads.esd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criar vetores
        Vetor<Integer> vetor1000 = new Vetor<>(1000);
        Vetor<Integer> vetor10000 = new Vetor<>(10000);
        Vetor<Integer> vetor100000 = new Vetor<>(100000);

        // Adicionar números aos vetores
        gerarNumeros(vetor1000, 1000, 0, 999999999);
        gerarNumeros(vetor10000, 10000, 0, 999999999);
        gerarNumeros(vetor100000, 100000, -999999999, 999999999);

        while (vetor1000.getTamanho() < 1000) {
            gerarNumeros(vetor1000, 1, 0, 999999999);
        }

        while (vetor10000.getTamanho() < 10000) {
            gerarNumeros(vetor10000, 1, 0, 999999999);
        }

        while (vetor100000.getTamanho() < 100000) {
            gerarNumeros(vetor100000, 1, 0, 999999999);
        }

        // Confirmar se os vetores estão completos
        System.out.println("Tamanho vetor 1000: " + vetor1000.getTamanho());
        System.out.println("Tamanho vetor 10000: " + vetor10000.getTamanho());
        System.out.println("Tamanho vetor 100000: " + vetor100000.getTamanho());

        // Buscar primeiro
        System.out.println("---------------------------------------------------------------");
        System.out.println("----------------------Buscar Primeiro Elemento-----------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------Vetor 1.000-------------------------");
        int primeiro = vetor1000.ler(0);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor1000, primeiro));

        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor1000, primeiro));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor10.000-------------------------");
        primeiro = vetor10000.ler(0);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor10000, primeiro));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor10000, primeiro));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor100.000------------------------");
        primeiro = vetor100000.ler(0);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor100000, primeiro));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor100000, primeiro));
        System.out.println("\n\n");

        // Meio
        System.out.println("--------------------------------------------------------------");
        System.out.println("----------------------Buscar Elemento do Meio-----------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------Vetor 1.000-------------------------");
        int meio = vetor1000.ler(500);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor1000, meio));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor1000, meio));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor 10.000--------------------------");
        meio = vetor10000.ler(5000);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor10000, meio));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor10000, meio));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor 100.000--------------------------");
        meio = vetor100000.ler(50000);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor100000, meio));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor100000, meio));
        System.out.println("\n\n");

        // Fim
        System.out.println("-------------------------------------------------------------");
        System.out.println("----------------------Buscar Último Elemento-----------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("--------------------------Vetor 1.000-------------------------");
        int tamanho = vetor1000.getTamanho();
        int ultimo = vetor1000.ler(tamanho - 1); // Indice 999
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor1000, ultimo));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor1000, ultimo));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor 10.000--------------------------");
        tamanho = vetor10000.getTamanho();
        ultimo = vetor10000.ler(tamanho - 1);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor10000, ultimo));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor10000, ultimo));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor 100.000--------------------------");
        tamanho = vetor100000.getTamanho();
        ultimo = vetor100000.ler(tamanho - 1);
        System.out.println("Utilizando busca linear: ");
        System.out.println(buscaLinear(vetor100000, ultimo));
        System.out.println("Utilizando busca binária: ");
        System.out.println(buscaBinaria(vetor100000, ultimo));
        System.out.println("\n\n");

        // -------------Busca Binária-------------
        // Todos os casos foram bons tendo um tempo de 0ms

        // Melhor caso
        // Buscar o elemento do meio independente do tamnaho do vetor teve 1 comparação
        // necessária

        // Caso médio e pior
        // Buscar o elemento do inicio e do fim deu os mesmos resultados sendo 9
        // comparações para 1.000, 13 para 10.000 e 16 para 100.000

        // -------------Busca linear-------------
        // Melhor caso
        // Todos do melhor caso tiveram tempo de 0ms
        // Todos os casos de buscar o primeiro elemento foram os melhores casos com
        // apenas 1 comparação

        // Caso médio
        //
        // Os 3 melhores casos médio foram: A busca para o elemento do meio do vetor de
        // 1.000 que realizou 501 coparações em 0ms, busca pelo último elemento do vetor
        // de 1.000, que fez 1.000 comparações em 0ms e por último foi buscar o elemento
        // do meio no array de 10.000 que fez 5.001 comparações em 0ms

        // Caso pior
        // Foi para buscar o elemento do meio do array de 100.000 que fez 50.001
        // comparações em 5ms e buscar o último do array de 100.000 que levou 100.000
        // comparações em 2ms

        // -------------Piores Tempos-------------
        // Os únicos maiores que 0ms foi para buscar o elemento do meio no vetor de
        // 100.000 que levou 5ms e para buscar o último elemento do vetor de 100.000 que
        // levou 2ms

    
        System.out.println("-------------Análise Final-------------");
        System.out.println("Array Binary Search");
        
        long inicio = System.nanoTime();
        int pos = Arrays.binarySearch(vetor100000.getDados(), ultimo);
        long fim = System.nanoTime();
        System.out.println(pos);
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo Arrays.binarySearch: " + duracaoMs + " ms");
        //Não houve diferença, ambos deram 0ms



        //Dicionário
        //A busca sequencial na pior das hipotese precisaria de 240000 etapas
        //A busca binária na pior hipotese precisaria de 18 etapas
        //A generalização é pela fórmula log de N na base 2 sendo N o tamanho do array 2^18 = 262.144, suficiente para cobrir o tamanho de 240.000
    }

    public static void gerarNumeros(Vetor<Integer> vetor, int qtd, int min, int max) {
        for (int i = 0; i < qtd; i++) {
            int numero = (int) (Math.random() * ((max - min) + 1)) + min;
            vetor.inserir(numero);
        }
    }

    public static int buscaLinear(Vetor<Integer> vetor, int alvo) {
        long inicio = System.nanoTime();
        int comparacoes = 0;
        for (int i = 0; i < vetor.getTamanho(); i++) {
            // Comparações
            comparacoes++;
            if (vetor.ler(i) == alvo) {
                System.out.println("Comparações totais feitas: " + comparacoes);
                long fim = System.nanoTime();
                long duracaoMs = (fim - inicio) / 1000000;
                System.out.println("Tempo: " + duracaoMs + " ms");
                return i;
            }
        }
        System.out.println("Comparações totais feitas: " + comparacoes);
        long fim = System.nanoTime();
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");
        return -1;
    }

    public static int buscaLinearOrdenado(Vetor<Integer> vetor, int alvo) {
        for (int i = 0; i < vetor.getTamanho(); i++) {
            if (vetor.ler(i) == alvo) {
                return i;
            } else if (vetor.ler(i) > alvo) {
                return -1;
            }
        }
        return -1;
    }

    public static int buscaBinaria(Vetor<Integer> vetor, int alvo) {
        long inicioTempo = System.nanoTime();
        int comparacoes = 0;
        int inicio = 0;
        int fim = vetor.getTamanho();

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoes++;

            if (vetor.ler(meio) == alvo) {
                System.out.println("Comparações feitas binária: " + comparacoes);
                long fimTempo = System.nanoTime();
                long duracaoMs = (fimTempo - inicioTempo) / 1000000;
                System.out.println("Tempo: " + duracaoMs + " ms");
                return meio;
            } else if (vetor.ler(meio) > alvo) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

        }
        long fimTempo = System.nanoTime();
        double duracaoMs = (fimTempo - inicioTempo) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");
        return -1;
    }
}