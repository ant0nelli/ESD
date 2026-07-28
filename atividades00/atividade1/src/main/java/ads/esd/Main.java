package ads.esd;


public class Main {
    static void main() {
        Funcionario Pedro = new Funcionario("Pedro", "teste", 3000);
        Gerente Maria = new Gerente("Maria", 8000, "teste");
        Funcionario Joana = new Funcionario("Joana", "teste", 3000);

        Funcionario[] funcionarios = {Pedro, Joana};


        Projeto teste = new Projeto(funcionarios, Maria);
        Projeto[] projetos = new Projeto[10];
        projetos[0] = teste;




        Funcionario Rafael = new Funcionario("Rafael", "segundo", 3000);
        Gerente Mario = new Gerente("Mario", 4000, "segundo");
        Funcionario[] funcSegundo = {Rafael, Joana};


        Projeto segundoProjeto = new Projeto(funcSegundo, Mario);
        projetos[1] = segundoProjeto;

        System.out.println(projetos[1]);


    }
}
