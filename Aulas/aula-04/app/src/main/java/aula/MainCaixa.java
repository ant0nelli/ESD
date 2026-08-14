package aula;

public class MainCaixa {
    static void main() {
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Olá mundo");
        System.out.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(50);
        System.out.println(caixaNumero.abrir());
    }
}
