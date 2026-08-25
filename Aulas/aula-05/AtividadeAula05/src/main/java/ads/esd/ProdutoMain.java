package ads.esd;

public class ProdutoMain {
    public static void main(String[] args){
        Vetor<Produto> estoque = new Vetor<>(10);
        Produto notebook = new Produto(1, "Notebook", 3500);
        estoque.inserir(notebook);

        Produto mouse = new Produto(1, "mouse", 50);
        estoque.inserir(mouse);

        Produto teclado = new Produto(1, "teclado", 200);
        estoque.inserir(teclado);

        estoque.imprimir();
    }
}
