import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Processo> listaProcessos = new ArrayList<>();
        Processo p1 = new Processo("P1", 7, 0);
        Processo p2 = new Processo("P2", 4, 0);
        Processo p3 = new Processo("P3", 5, 1);
        Processo p4 = new Processo("P4", 6, 2);
        Processo p5 = new Processo("P5", 3, 4);
        

        listaProcessos.add(p1);
        listaProcessos.add(p2);
        listaProcessos.add(p3);
        listaProcessos.add(p4);
        listaProcessos.add(p5);

        Escalonador<Processo> escalonador = new Escalonador<>(listaProcessos);
        escalonador.executar();
        
    }
}
