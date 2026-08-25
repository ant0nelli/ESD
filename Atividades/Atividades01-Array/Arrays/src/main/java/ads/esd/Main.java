package ads.esd;

public class Main {
    public static void main(String[] args) {
        boolean completo = false;
        boolean completo1 = false;
        boolean completo2 = false;
        boolean completo3 = false;
        
        Vetor<Integer> vetor1000 = new Vetor<>(1000);
        Vetor<Integer> vetor10000 = new Vetor<>(10000);
        Vetor<Integer> vetor100000 = new Vetor<>(100000);

        gerarNumeros(vetor1000, 1000, -999999999, 999999999);
        gerarNumeros(vetor10000, 10000, -999999999, 999999999);
        gerarNumeros(vetor100000, 100000, -999999999, 999999999);

//        while(vetor100000.getTamanho() < 100000){
//            gerarNumeros(vetor1000, 1,-999999999, 999999999 );
//        }

        System.out.println("Tamanho vetor 1000: " + vetor1000.getTamanho());
        System.out.println("Tamanho vetor 10000: " + vetor10000.getTamanho());
        System.out.println("Tamanho vetor 100000: " + vetor100000.getTamanho());

        //Buscar primeiro
        System.out.println("----------------------Buscar Primeiro Elemento-----------------");
        System.out.println("---------------------------Vetor 1000--------------------------");
        int primeiro = vetor1000.ler(0);
        System.out.println("Buscar o primeiro elemento do vetor de 1000 usando busca linear: ");
        System.out.println(buscaLinear(vetor1000, primeiro));
        System.out.println("\n\n");
        System.out.println("Buscar o primeiro elemento do vetor de 1000 usando busca binaria: ");
        System.out.println(buscaBinaria(vetor1000, primeiro));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor 10000-------------------------");
        primeiro = vetor10000.ler(0);
        System.out.println("Buscar o primeiro elemento do vetor de 10000 usando busca linear: ");
        System.out.println(buscaLinear(vetor10000, primeiro));
        System.out.println("\n\n");
        System.out.println("Buscar o primeiro elemento do vetor de 10000 usando busca binaria: ");
        System.out.println(buscaBinaria(vetor10000, primeiro));
        System.out.println("\n\n");

        System.out.println("---------------------------Vetor 100000------------------------");
        primeiro = vetor100000.ler(0);
        System.out.println("Buscar o primeiro elemento do vetor de 100000 usando busca linear: ");
        System.out.println(buscaLinear(vetor100000, primeiro));
        System.out.println("\n\n");
        System.out.println("Buscar o primeiro elemento do vetor de 100000 usando busca binaria: ");
        System.out.println(buscaBinaria(vetor100000, primeiro));
        System.out.println("\n\n");


        //Meio



        //Fim
        int tamanho = vetor1000.getTamanho();
        int ultimo = vetor1000.ler(tamanho-1); //Indice 999
        System.out.println("Buscar último elemento do vetor de 1000 usando busca linear " + buscaLinear(vetor1000, ultimo));
        System.out.println("\n\n");
        System.out.println("Buscar último elemento do vetor de 1000 usando busca binaria: " + buscaBinaria(vetor1000, ultimo));
        System.out.println("\n\n");

        tamanho = vetor10000.getTamanho();
        ultimo = vetor10000.ler(tamanho-1);
        System.out.println("Buscar último elemento do vetor de 10000 usando busca linear: " + buscaLinear(vetor10000, ultimo));
        System.out.println("\n\n");
        System.out.println("Buscar último elemento do vetor de 10000 usando busca binaria: " + buscaBinaria(vetor10000, ultimo));
        System.out.println("\n\n");


        tamanho = vetor100000.getTamanho();
        ultimo = vetor100000.ler(tamanho-1);
        System.out.println("Buscar último elemento do vetor de 100000 usando busca linear: " + buscaLinear(vetor100000, ultimo));
        System.out.println("\n\n");
        System.out.println("Buscar último elemento do vetor de 100000 usando busca binaria: " + buscaBinaria(vetor100000, ultimo));
        System.out.println("\n\n");
        

    }


    public static void gerarNumeros(Vetor<Integer> vetor, int qtd, int min, int max) {
        for (int i = 0; i < qtd; i++) {
            int numero = (int) (Math.random() * ((max - min) + 1)) + min;
            vetor.inserir(numero);
        }
    }

    public static int buscaLinear(Vetor<Integer> vetor, int alvo) {
        long inicio =  System.nanoTime();
        int comparacoes = 0;
        for (int i = 0; i < vetor.getTamanho(); i++) {
            //Comparações
            comparacoes++;
            if (vetor.ler(i) == alvo) {
                System.out.println("Comparações " + comparacoes);
                long fim = System.nanoTime();
                double duracaoMs = (fim - inicio) / 1_000_000.0;
                System.out.println("Tempo: " + String.format("%.6f", duracaoMs) + " ms");
                return i;
            }
        }
        System.out.println("Comparações: " + comparacoes);
        long fim = System.nanoTime();
        double duracaoMs = (fim - inicio) / 1_000_000.0;
        System.out.println("Tempo: " + String.format("%.6f", duracaoMs) + " ms");
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
                double duracaoMs = (fim - inicio) / 1_000_000.0;
                System.out.println("Tempo: " + String.format("%.6f", duracaoMs) + " ms");
                return meio;
            } else if (vetor.ler(meio) > alvo) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

        }
        long fimTempo = System.nanoTime();
        double duracaoMs = (fim - inicio) / 1_000_000.0;
        System.out.println("Tempo: " + String.format("%.6f", duracaoMs) + " ms");
        return -1;
    }
}