package aula;

public class MainProduto {

    static void main() {
        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1, "Monitor", 500));
        estoque.inserir(new Produto(2, "Teclado", 100));
        estoque.inserir(new Produto(3, "Mouse", 10));

        estoque.inserir(new Produto(1, "Monitor", 500));

        estoque.imprimir();

    }

}