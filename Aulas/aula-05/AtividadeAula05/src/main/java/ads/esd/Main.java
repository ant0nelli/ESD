package ads.esd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<>(50);
        vetor.inserir(0);
        vetor.imprimir();
        gerarNumeros(vetor, 10, 1, 1000);
        vetor.imprimir();
    }


    public static void gerarNumeros(Vetor<Integer> vetor, int qtd, int min, int max){
        for (int i = 0; i <= qtd; i++) {
            int numero = (int)(Math.random() * ((max - min) + 1)) + min;
            vetor.inserir(numero);
        }
    }
}
