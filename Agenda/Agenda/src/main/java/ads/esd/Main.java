package ads.esd;

public class Main {
    public static void main(String[] args) {
        Contato arthur = new Contato("Arthur", "489910475884", "arthur@email.com");

        Agenda primeiraAgenda = new Agenda(10);

        primeiraAgenda.addContato(arthur);

        System.out.println("Mostrar todos os contatos: ");
        primeiraAgenda.getContatos();
        System.out.println("\n\n ");

        Contato joao = new Contato("joao", "398427", "joao@email.com");
        primeiraAgenda.addContato(joao);

        System.out.println("Mostrar todos os contatos: ");
        primeiraAgenda.getContatos();

        // primeiraAgenda.removeContato(arthur);
        // primeiraAgenda.getContatos();

        System.out.println("Criar outro arthur");
        Contato arthur2 = new Contato("Arthur", "4894910475884", "arthur2@email.com");
        primeiraAgenda.addContato(arthur2);

        System.out.println("Telefones iguais");
        Contato arthur3 = new Contato("Arthur 3", "489910475884", "arthur3@email.com");
        primeiraAgenda.addContato(arthur3);
        primeiraAgenda.getContatos();

        //Buscar por nome
        System.out.println("Buscar por nome");
        System.out.println(primeiraAgenda.getContato("Arthur"));

        System.out.println("Buscar por telefone");
        System.out.println(primeiraAgenda.getContato("398427"));


        //Criar e inserir novo contato sem email
        Contato josefina = new Contato("Josefina","123456");
        primeiraAgenda.addContato(josefina);

        primeiraAgenda.getContatos();

        //Atualizar contato
        System.out.println("Atualizar email e nome");
        primeiraAgenda.updateContato(josefina, TipoDado.EMAIL, "josefina@email.com");
        primeiraAgenda.getContatos();
        primeiraAgenda.updateContato(joao, TipoDado.NOME, "João");
        primeiraAgenda.getContatos();

        System.out.println("\n\n");

        //Buscar por prefixo
        System.out.println("Buscar por prefixo");
        System.out.println(primeiraAgenda.buscarPrefixo("J"));
        
    }
}
