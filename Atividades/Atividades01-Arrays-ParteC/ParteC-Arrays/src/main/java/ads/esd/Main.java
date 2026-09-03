package ads.esd;


public class Main {
    static void main() {
        int opcao = 0;
        VetorLista agenda = new VetorLista();
        System.out.println("--- MENU DA AGENDA DE CONTATOS ---");
        System.out.println("1 - Adicionar contato (Ordenado)");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Buscar contato");
        System.out.println("4 - Atualizar contato");
        System.out.println("5 - Sair");

        agenda.VetorDeLista();
        
        while (opcao != 5) {
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(IO.readln());
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = IO.readln();
                    agenda.inserir(nome);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a remover: ");
                    String nome = IO.readln();
                    agenda.remover(nome);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a buscar: ");
                    nome = IO.readln();
                    agenda.buscarPorNome(nome);
                    break;
                case 4:
                    System.out.println("Digtite o nome do contato a atualizar: ");
                    nome = IO.readln();
                    agenda.updateContato(String nome, String telefone);

                case 5:

                default:
            }
        }


    }
}
