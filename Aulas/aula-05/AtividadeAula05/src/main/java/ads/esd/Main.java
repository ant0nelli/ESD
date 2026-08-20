package ads.esd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<>(50);
        vetor.inserir(0);
        vetor.imprimir();
        gerarNumeros(vetor, 10, -30, 30);
        vetor.imprimir();
        System.out.println(vetor.getTamanho());
        System.out.println(buscaLinearOrdenado(vetor, 5));

    }


    public static void gerarNumeros(Vetor<Integer> vetor, int qtd, int min, int max){
        for (int i = 0; i <= qtd; i++) {
            int numero = (int)(Math.random() * ((max - min) + 1)) + min;
            vetor.inserir(numero);
        }
    }

    public static int buscaLinear(Vetor<Integer> vetor, int alvo){
        for (int i = 0; i < vetor.getTamanho(); i++) {
            if(vetor.ler(i) == alvo){
                return i;
            }
        }
        return -1;
    }

    public static int buscaLinearOrdenado(Vetor<Integer> vetor, int alvo){
        for (int i = 0; i < vetor.getTamanho(); i++) {
            if(vetor.ler(i) == alvo){
                return i;
            }else if (vetor.ler(i) > alvo){
                return -1;
            }
        }
        return -1;
    }

    public static int buscaBinaria(Vetor<Integer> vetor, int alvo){
        int inicio = 0;
        int fim = vetor.getTamanho();

        while (inicio <= fim){
            int meio = inicio+fim/2;

            if(vetor.ler(meio) == alvo){
                return meio;
            }else if(vetor.ler(meio) > alvo){
                fim = meio-1;
            }else{
                inicio = fim;
            }

        }
    }
}
