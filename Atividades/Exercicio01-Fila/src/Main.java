public class Main {
    public static void main(String[] args) {
        Servidor cenario = new Servidor();
        Fila<Requisicoes> fila = new Fila<Requisicoes>(100);
        cenario.executar(10000, fila, 5, 15);

        Fila<Requisicoes> fila2 = new Fila<>(20);
        cenario.executar(10000, fila2, 10, 20);

        Fila<Requisicoes> fila3 = new Fila<>(5);
        cenario.executar(10000, fila3, 1, 10);
    }
}
