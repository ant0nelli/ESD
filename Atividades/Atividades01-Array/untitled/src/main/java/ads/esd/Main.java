package ads.esd;



public class Main {
    public static void main(String[] args) {
        Vetor<Integer> vetor1000 = new Vetor<>(1000);
        Vetor<Integer> vetor10000 = new Vetor<>(10000);
        Vetor<Integer> vetor100000 = new Vetor<>(100000);

        gerarNumeros(vetor1000, 1000, -100000000, 100000000);
        gerarNumeros(vetor10000, 10000, -100000000, 100000000);
        gerarNumeros(vetor100000, 100000, -100000000, 100000000);
        System.out.println(vetor1000.getTamanho());
        System.out.println(vetor10000.getTamanho());
        System.out.println(vetor100000.getTamanho());

        //Buscar primeiro



        //Meio
        //Fim
        int ultimo = vetor1000.ler(vetor1000.getTamanho());
        buscaLinear(vetor1000, ultimo);

        ultimo = vetor10000.ler(vetor1000.getTamanho());
        buscaLinear(vetor10000, ultimo);

        ultimo = vetor100000.ler(vetor1000.getTamanho());
        buscaLinear(vetor100000, ultimo);

    }


    public static void gerarNumeros(Vetor<Integer> vetor, int qtd, int min, int max) {
        for (int i = 0; i <= qtd; i++) {
            int numero = (int) (Math.random() * ((max - min) + 1)) + min;
            vetor.inserir(numero);
        }
    }

    public static int buscaLinear(Vetor<Integer> vetor, int alvo) {
        for (int i = 0; i < vetor.getTamanho(); i++) {
            if (vetor.ler(i) == alvo) {
                return i;
            }
        }
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
        int inicio = 0;
        int fim = vetor.getTamanho();

        while (inicio <= fim) {
            int meio = inicio + fim / 2;

            if (vetor.ler(meio) == alvo) {
                return meio;
            } else if (vetor.ler(meio) > alvo) {
                fim = meio - 1;
            } else {
                inicio = fim;
            }

        }
        return -1;
    }
}