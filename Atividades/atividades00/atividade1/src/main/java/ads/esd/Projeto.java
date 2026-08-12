package ads.esd;


public class Projeto {
    private String nome;
    private Funcionario[] funcionarios;
    private Gerente gerente;

    public Projeto(String nome, Funcionario[] funcionarios, Gerente gerente) {
        this.funcionarios = funcionarios;
        this.gerente = gerente;
        this.nome = nome;

        this.gerente.setFuncionariosSupervisionados(funcionarios.length);
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
            total += f.getRemuneracao();
        }

        return gerente.remuneracao() + total;
    }

    public void finalizarProjeto(){
        this.gerente.setProjetoFinalizado();

        for(Funcionario f: funcionarios){
            f.setProjetoFinalizado();
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do projeto: ").append(this.nome).append("\n");
        sb.append(gerente.toString()).append("\n");
        sb.append("Funcionários: ").append("\n");

        for (Funcionario f : funcionarios) {
            sb.append(f.getNome()).append(": ").append(f.getRemuneracao()).append("\n");
        }


        sb.append("Custo total: ").append(custoTotal()).append("\n");
        return sb.toString();
    }
}
