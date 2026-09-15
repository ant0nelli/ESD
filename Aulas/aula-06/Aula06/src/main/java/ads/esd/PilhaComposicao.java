package ads.esd;

public class PilhaComposicao<T extends  Comparable<T>> {
    private Vetor<T> vetor;

    public PilhaComposicao(int capacidade) {
        vetor = new Vetor<>(capacidade);
    }

    public void push(T elemento){
        vetor.inserir(elemento);
    }

    public boolean isEmpty(){
        return vetor.getTamanho() == 0;
    }

    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("Pilha vazia");
        }
        T valor = vetor.ler(vetor.getTamanho() - 1);
        vetor.remover(vetor.getTamanho() -1 );
        return valor;
    }

    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia");
        }
        return vetor.ler(vetor.getTamanho()-1);
    }
}
