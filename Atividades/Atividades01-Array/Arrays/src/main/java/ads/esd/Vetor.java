package ads.esd;

public class Vetor<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade) {
        elementos = (T[]) new Object[quantidade];
        tamanho = 0;

    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }

        // Verificar repetição
        if (verificarRepetido(elemento)) {
            return;
        }

        // Inserir e reordenar
        // v = {5,8,12,15}
        // elemento = 10
        // tamanho = 4

        if (tamanho == 0) {
            elementos[0] = elemento;
            tamanho++;
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            if ((Integer) elemento < (Integer) elementos[i]) { 
                // Deslocar
                for (int j = tamanho; j > i; j--) { 
                    elementos[j] = elementos[j - 1]; 

                }

                // inserir posição i
                elementos[i] = elemento; 
                tamanho++;
                return;
            } // 5,8,12,12,15 -> 5,8,10,12,15
            else if ((Integer) elementos[tamanho - 1] < (Integer) elemento) {
                elementos[tamanho] = elemento;
                tamanho++;
                return;
            }
        }

        elementos[tamanho] = elemento;
        tamanho++;
    }

    public boolean verificarRepetido(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
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
        if (tamanho <= elementos.length / 4) {
            T[] novo = (T[]) new Object[elementos.length / 2];
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
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public T ler(int indice) {
        return elementos[indice];
    }

    public int getTamanho() {
        return tamanho;
    }

    public Object[] getDados() {
        return  this.elementos;
    }

}