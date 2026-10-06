package ads.esd;

public class Main {
    static void main() {
        FilaCircular<Integer> f = new FilaCircular<Integer>(20);
        f.enfileirar(3);
        f.enfileirar(4);
        f.enfileirar(5);
        f.enfileirar(6);
        f.imprimir();
        f.desenfileirar();
        f.imprimir();
        f.enfileirar(7);
        f.enfileirar(8);
        f.enfileirar(9);
        f.enfileirar(10);
        f.imprimir();
        f.desenfileirar();
        f.desenfileirar();
        f.desenfileirar();
        f.desenfileirar();
        f.imprimir();
    }
}
