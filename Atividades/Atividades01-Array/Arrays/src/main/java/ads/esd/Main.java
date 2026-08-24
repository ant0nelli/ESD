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

        // while (!completo){
        //     if(vetor1000.getTamanho() < 1000){
        //         gerarNumeros(vetor1000, 1000, -999999999, 999999999);
        //     }else completo1 = true;
        //     if(vetor10000.getTamanho() < 10000){
        //         gerarNumeros(vetor1000, 1000, -999999999, 999999999);
        //     }else completo2 = true;
        //     if(vetor100000.getTamanho() < 100000){
        //         gerarNumeros(vetor1000, 1000, -999999999, 999999999);
        //     }else completo3 = true;
        //     if(completo1 && completo2 && completo3) completo = true;
        // }

        System.out.println(vetor1000.getTamanho());
        System.out.println(vetor10000.getTamanho());
        System.out.println(vetor100000.getTamanho());

        //Buscar primeiro



        //Meio



        //Fim
        int tamanho = vetor1000.getTamanho();
        int ultimo = vetor1000.ler(tamanho-1); //Indice 999
        System.out.println("Último 1000" + buscaLinear(vetor1000, ultimo));

        tamanho = vetor10000.getTamanho();
        ultimo = vetor10000.ler(tamanho-1);
        System.out.println( "Último 10000" + buscaLinear(vetor10000, ultimo));
        

        tamanho = vetor100000.getTamanho();
        ultimo = vetor100000.ler(tamanho-1);
        System.out.println("Último 100000" + buscaLinear(vetor100000, ultimo));
        

    }


    public static void gerarNumeros(Vetor<Integer> vetor, int qtd, int min, int max) {
        for (int i = 0; i < qtd; i++) {
            int numero = (int) (Math.random() * ((max - min) + 1)) + min;
            vetor.inserir(numero);
        }
    }

    public static int buscaLinear(Vetor<Integer> vetor, int alvo) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.getTamanho(); i++) {
            //Comparações
            comparacoes++;
            if (vetor.ler(i) == alvo) {
                System.out.println(comparacoes);
                return i;
            }
        }
        System.out.println(comparacoes);
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