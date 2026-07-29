package ads.esd;


public class Main {
    public static void main(String[] args) {
        Projeto[] projetos = new Projeto[10];

        //Primeiro Projeto
        Funcionario Pedro = new Funcionario("Pedro", "teste", 3000);
        Funcionario Joana = new Funcionario("Joana", "teste", 3000);
        Funcionario[] funcTeste = {Pedro, Joana};
       
        Gerente Maria = new Gerente("Maria", 8000, "teste");

        Projeto teste = new Projeto("Projeto de Teste", funcTeste, Maria);
        projetos[0] = teste;


        //Segundo Projeto
        Funcionario Rafael = new Funcionario("Rafael", "segundo", 3000);
        Gerente Mario = new Gerente("Mario", 4000, "segundo");
        Funcionario[] funcSegundo = {Rafael, Joana};

        Projeto segundoProjeto = new Projeto("Segundo Projeto", funcSegundo, Mario);
        projetos[1] = segundoProjeto;

        
        //Terceiro Projeto
        Funcionario Jose = new Funcionario("José", "ProjetoGrande", 3000);
        Funcionario Josefina = new Funcionario("Joséfina", "ProjetoGrande", 3000);
        Funcionario Wilson = new Funcionario("Wilson", "ProjetoGrande", 3000);
        Funcionario Coraline = new Funcionario("Coraline", "ProjetoGrande", 3000);
        Gerente Gru = new Gerente("Gru",20000,"ProjetoGrande");
        
        Funcionario[] funcProjetoGrande = {Jose, Josefina, Wilson, Coraline};
        
        Projeto ProjetoGrande = new Projeto("Projeto Grande", funcProjetoGrande, Gru);
        projetos[2] = ProjetoGrande;

        System.out.println(projetos[2]);
        ProjetoGrande.finalizarProjeto();

        System.out.println("Projeto FInalizado \n"+projetos[2]);


    }
}
