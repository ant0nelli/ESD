package ads.esd;

public class Agenda {
    private Contato[] agenda;
    private int tamanho = 0;
    private int quantidade;


    public Agenda(int quantidade) {
        agenda = new Contato[quantidade];
    }

    //Adicionar Contato
    public void addContato(Contato nome) {
        if (tamanho >= agenda.length) {
            System.out.println("Agenda está cheia");
            return;
        }
        this.agenda[tamanho] = nome;
        tamanho++;
    }


    //Remover passando o Contato
    public void remover(Contato nome) {
        for (int i = 0; i < tamanho; i++) {
            if (agenda[i].equals(nome)) {
                remover(agenda[i]);
                return;
            }
        }
    }

    //Listar contatos
    public void getContatos() {
        System.out.print("[");
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                break;
            }
            System.out.print(agenda[i]);

            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    //Remover indice e reoordenar
    private void remover(int indice) {
        if (indice > 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            agenda[i] = agenda[i + 1];
        }
        agenda[tamanho - 1] = null;
        tamanho--;
    }

    //Excluir um contato
    public void removeContato(Contato nome) {
        for (int i = 0; i < tamanho; i++) {
            if (agenda[i].equals(nome)) {
                remover(i);
                return;
            }
        }
    }

    //Buscar Contato
    public String getContato(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (agenda[i].getEmail().equals(valor) || agenda[i].getNome().equals(valor)) {
                return agenda[i].toString();
            }

        }
        return "";
    }
}
