import java.util.List;
import java.util.ArrayList;

public class Escalonador<T extends Comparable<T>> {
    private FilaCircular<Processo> fila;
    private List<Processo> novosProcessos;
    private int tempoAtual;
    private int quantum;
    private int totalProcessos;
    private int processosTerminado;

    public Escalonador(List<Processo> processos) {
        this.fila = new FilaCircular<>(10);
        this.novosProcessos = new ArrayList<>(processos);
        this.tempoAtual = 0;
        this.totalProcessos = processos.size();
        this.processosTerminado = 0;
        this.quantum = 2;

    }

    public void verificarNovos() {
        List<Processo> removidos = new ArrayList<Processo>(10);
        for (Processo p : novosProcessos) {
            if (p.getTempoChegada() <= tempoAtual) {
                fila.enfileirar(p);
                System.out.println("Tempo " + tempoAtual + ": " + p.getNome() + " chegou e entrou na fila");
                removidos.add(p);
            }
        }
        novosProcessos.removeAll(removidos);

    }

    public void executar() {
        while (processosTerminado < totalProcessos) {
            verificarNovos();

            if (fila.isEmpty()) {
                System.out.println("Nenhum processo para ser executado.");
                tempoAtual++;
                continue;
            }
            Processo atual = fila.desenfileirar();
            atual.setStatus(Status.EXECUTANDO);
            try {
                System.out.println(atual.getNome() + " executando...");
                Thread.sleep(2000); // pausa 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            
            int executadas = (quantum < atual.getInstrucoesRestantes()) ? quantum : atual.getInstrucoesRestantes();
            atual.setInstrucoesRestantes(atual.getInstrucoesRestantes() - executadas);
            tempoAtual += executadas;

            System.out.println(atual.getNome() + " executou " + executadas + " instuções. Restam: "
                    + atual.getInstrucoesRestantes());
            verificarNovos();
            if (atual.getInstrucoesRestantes() < 1) {
                atual.setStatus(Status.TERMINADO);
                processosTerminado++;
                System.out.println(atual.getNome() + " terminou.");
            } else {
                atual.setStatus(Status.PRONTO);
                fila.enfileirar(atual);
            }
        }
        System.out.println("FIM");
    }

}
