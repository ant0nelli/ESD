package ads.esd;

public class Funcionario {
    private String nome;
    private String projeto;
    private double salario;
    private boolean projetoFinalizado;


    public double getRemuneracao(){
        if (projetoFinalizado){
            return salario + (salario * 0.10);
        }
        return salario;
    }

    public Funcionario(String nome, String projeto, double salario) {
        this.nome = nome;
        this.projeto = projeto;
        this.salario = salario;
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
}
