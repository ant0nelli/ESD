package ads.esd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        VetorEstatico v1 = new VetorEstatico(10);
        v1.inserir(0,"primeiro");
        v1.inserir( 1,"segundo");
        v1.inserir(2,"terceiro");
        v1.inserir(3,"quarto");
        v1.imprimir();
        System.out.println(v1.obterTamanho());
        v1.removerUltimo();
        v1.imprimir();
        System.out.println(v1.obterTamanho());

    }
}
