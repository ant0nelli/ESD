package ads.esd;

public class VetorDinamico {
    private int tamanho;
    private Contato[] elementos;

    public VetorDinamico(int quantidade) {
        elementos = new Contato[quantidade];
        this.tamanho = 0;
    }

    public void inserir(Contato contato) {
        if (tamanho == elementos.length) {
            expandir();
        }

        // Ordenado
        int posicaoInserir = tamanho;

        for (int i = 0; i < tamanho; i++) {
            if (contato.getNome().compareToIgnoreCase(elementos[i].getNome()) <= 0) {
                posicaoInserir = i;
                break;
            }
        }
        for (int j = tamanho; j > posicaoInserir; j--) {
            elementos[j] = elementos[j - 1];
        }

        elementos[posicaoInserir] = contato;
        tamanho++;
    }

    public void expandir() {
        Contato[] novo = new Contato[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    public void reduzir() {
        if (tamanho <= elementos.length / 4) {
            Contato[] novo = new Contato[elementos.length / 2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }

    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }

        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();

    }

    public String removerPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].getNome().equalsIgnoreCase(nome)) {
                remover(i);
                return "Contato removido com sucesso!";
            }
        }
        return "Contato não encontrado.";
    }

    public String updateContato(String nome, String telefoneNovo) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].getNome().equalsIgnoreCase(nome)) {
                elementos[i].setTelefone(telefoneNovo);
                return "Contato atualizado com sucesso!";
            }
        }
        return "Não foi possível encontrar o contato";
    }

    public String getContato(String valor) {

        for (Contato c : elementos) {
            if (c != null) {
                if (c.getNome().equalsIgnoreCase(valor)) {

                    char letraVetor = Character.toUpperCase(c.getNome().charAt(0));

                    return "Contato encontrado no Vetor '" + letraVetor + "': " + c.getNome() + ", Telefone: "
                            + c.getTelefone();
                }
            }
        }
        return "Contato não encontrado.";

    }

    public void buscarPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].getNome().equals(nome)) {
                getContato(nome);
                return;
            }
        }
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < elementos.length; i++) {
            // if(elementos[i] == null){
            // break;
            // }
            System.out.print(elementos[i]);

            if (i < elementos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}