package ads.esd;

public class Gerente {
    private String nome;
    private String projeto;
    private double salario;
    private int funcionariosSupervisionados;
    private boolean projetoFinalizado;

    public Gerente(String nome, double salario, String projeto) {
        this.nome = nome;
        this.salario = salario;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public String getProjeto() {
        return projeto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setProjetoFinalizado(){
        projetoFinalizado = true;
    }

    public void setFuncionariosSupervisionados(int funcionariosSupervisionados){
        this.funcionariosSupervisionados = funcionariosSupervisionados;
    }

    public double remuneracao(){
        if(projetoFinalizado){
            return (salario + (salario*0.10)) + ((salario * 0.01) * funcionariosSupervisionados);
        }
        return salario + ((salario * 0.01) * funcionariosSupervisionados);
    }

    @Override
    public String toString() {
        return "Gerente " + nome + " | Salário: " + remuneracao();
    }
}
