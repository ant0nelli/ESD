package ads.esd;

import java.util.Arrays;

public class Projeto {
    private String nome;
    private Funcionario[] funcionarios;
    private Gerente gerente;

    public Projeto(Funcionario[] funcionarios, Gerente gerente) {
        this.funcionarios = funcionarios;
        this.gerente = gerente;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    private double custoTotal(){
        double total = 0;
        for(Funcionario f: funcionarios){
            total += f.getSalario();
        }

        return gerente.getSalario() + total;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do projeto: ").append(this.nome).append("\n");
        sb.append(gerente.toString()).append("\n");
        sb.append("Funcionários: ").append("\n");

        for (Funcionario f : funcionarios) {
            sb.append(f.getNome()).append(": ").append(f.getSalario()).append("\n");
        }


        sb.append("Custo total: ").append(custoTotal()).append("\n");
        return sb.toString();
    }
}
