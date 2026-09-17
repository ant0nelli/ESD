package ads.esd;

public class Stack<T extends Comparable<T>> {

    private Vetor<T> vetor;

    public Stack(int capacidade) {
        vetor = new Vetor<>(capacidade);
    }


    public void push(T elemento) {
        vetor.inserir(elemento);
    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha Vazia");
        }
        T valor = vetor.ler(vetor.getTamanho()-1);
        vetor.remover(vetor.getTamanho()-1);
        return valor;
    }
    public boolean isEmpty() {
        return vetor.getTamanho() == 0;
    }

    public T peek() {
        if (isEmpty()){
            throw new RuntimeException("Pilha Vazia");
        }
        return vetor.ler(vetor.getTamanho()-1);
    }




}
