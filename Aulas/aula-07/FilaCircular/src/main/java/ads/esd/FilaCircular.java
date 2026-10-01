package ads.esd;

public class FilaCircular<T extends Comparable<T>> {

    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public FilaCircular(int capacidade) {
        elementos = (T[]) new Comparable[capacidade];
        tamanho = 0;
        fim = -1;
        inicio = 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length){
            throw new RuntimeException("Fila está cheia");
        }
        fim = (fim + 1) % elementos.length;
        elementos[fim] = elemento;
        tamanho++;
    }

    public T desenfileirar() {
        if(isEmpty()){
            throw new RuntimeException("Fila está vazia");
        }
        T valor = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public void imprimir(){
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % elementos.length;
            System.out.print(elementos[indice] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }



}
