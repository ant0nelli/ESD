package ads.esd;

public class Vetor<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade){
        elementos = (T[])  new Object[quantidade];
        tamanho = 0;

    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }
        //Verificar repetição
        for (int i = 0; i < tamanho; i++) {
            if(elemento.equals((Integer) elementos[i])){
                System.out.println("Valor repetido");
                break;
            }
        }

        if(tamanho == 0){
            elementos[0] = elemento;
            tamanho++;
        }

        //Ordem crescente
        //20
        for (int i = 0; i < tamanho; i++) {
            if((Integer) elemento < (Integer) elementos[i]){
                reordenarInserir(i, elemento);
                break;
            }
        }
    }

    private void reordenarInserir(int posicao, T elemento){
        for (int i = tamanho -1; i >= 0; i--) {
            Integer atual = (Integer) elementos[i];
            if(atual > (Integer) elemento){
                elementos[i+1] = elementos[i];
            }
            else{
                break;
            }
            elementos[i+1] = elemento;
        }


        tamanho++;
    }


    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (tamanho <= elementos.length/4) {
            T[] novo = (T[]) new Object[elementos.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }
        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
        reduzir();
    }




    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho ; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

@SuppressWarnings("unchecked")
    public void gerarNumeros(int qtd, int max, int min){
        for (int i = 0; i < qtd; i++) {
            int numero = (int)(Math.random() * ((max - min) + 1)) + min;
            inserir((T) Integer.valueOf(numero));

        }
        imprimir();
    }



}