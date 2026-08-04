package ads.esd;

public class Main {
    public static void main(String[] args) {
        Contato arthur = new Contato("Arthur", "489910475884", "arthur@email.com");

        Agenda primeiraAgenda = new Agenda(10);

        primeiraAgenda.addContato(arthur);

        primeiraAgenda.getContatos();


        Contato joao = new Contato("joao", "398427", "joao@email.com");
        primeiraAgenda.addContato(joao);
        primeiraAgenda.getContatos();
//        primeiraAgenda.removeContato(arthur);
//        primeiraAgenda.getContatos();
        System.out.println("Procurar joao");
        primeiraAgenda.getContato("joao");
    }
}
