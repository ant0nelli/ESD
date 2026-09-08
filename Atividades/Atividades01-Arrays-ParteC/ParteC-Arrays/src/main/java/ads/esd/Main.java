package ads.esd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    Contato c = new Contato(nome, telefone);
                    agenda.inserir(c);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a remover: ");
                    nome = scanner.nextLine();
                    agenda.remover(nome);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a buscar: ");
                    nome = scanner.nextLine();
                    agenda.buscarPorNome(nome);
                    break;
                case 4:
                    System.out.print("Digtite o nome do contato a atualizar: ");
                    nome = scanner.nextLine();
                    System.out.println("Digtite o novo telefone do contato a atualizar: ");
                    telefone = scanner.nextLine();
                    agenda.updateContato(nome, telefone);
                    break;
                case 5:
                    System.out.println("Saindo");
                default:
            }
        }
        scanner.close();

    }
}
