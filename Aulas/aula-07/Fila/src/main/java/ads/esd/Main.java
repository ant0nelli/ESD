package ads.esd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        Fila<String> fila = new Fila<>(10);
//
//        fila.enfileirar("A");
//        fila.enfileirar("B");
//        fila.enfileirar("C");
//        fila.imprimir();
//        fila.enfileirar("D");
//        fila.enfileirar("E");
//        fila.desenfileirar();
//        fila.imprimir();

        Fila<Pacote> fila = new Fila<Pacote>(10);

        Produtor pr1 = new Produtor("Produtor 1", "PC-A");
        Produtor pr2 = new Produtor("Produtor 2", "PC-B");

        pr1.produzirPacote(fila, 1, "login", "Servidor 1", "AAAA");
        pr1.produzirPacote(fila, 2,"imagem", "Servidor 2", "AAAA");

        pr1.produzirPacote(fila, 3,"imagem", "Servidor 2", "AAAA");

        System.out.println("Fila de pacotes");
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();
    }
}
