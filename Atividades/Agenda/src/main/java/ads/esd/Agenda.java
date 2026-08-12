package ads.esd;

public class Agenda {
    private Contato[] agenda;
    private int tamanho = 0;

    public Agenda(int quantidade) {
        agenda = new Contato[quantidade];
    }

    // Adicionar Contato
    public void addContato(Contato nome) {


        // Verificar dados repetidos
        if (tamanho > 0) {
            for (Contato c : this.agenda) {
                if (c != null) {
                    if (c.getNome().equals(nome.getNome())) {
                        throw new IllegalStateException("Esse nome já existe na agenda");

                    } else if (c.getTelefone().equals(nome.getTelefone())) {
                        throw new IllegalStateException("Esse telefone já existe na agenda");
                    }
                    if(c.getEmail() != null && c.getEmail().equals(nome.getEmail())){
                        throw new IllegalStateException ("Esse email já existe na agenda");
                    }
                }
            }
        }

        if(tamanho == agenda.length){
            expandir();
        }
        agenda[tamanho] = nome;
        tamanho++;
//        this.agenda[tamanho] = nome;
//        tamanho++;
    }

    public void expandir(){
        Contato[] novo = new Contato[agenda.length * 2];
        for (int i = 0; i < agenda.length; i++) {
            novo[i] = agenda[i];
        }
        agenda = novo;
    }

    public void reduzir(){
        if(tamanho <= agenda.length/4) {
            Contato[] novo = new Contato[agenda.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = agenda[i];
            }
            agenda = novo;
        }


    }

    // Remover passando o Contato
    public void remover(int indice){
        if(indice < 0 || indice >= tamanho){
            System.out.println("Indice Inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            agenda[i] = agenda[i+1];
        }
        agenda[tamanho-1] = null;
        tamanho--;
        reduzir();

    }

    // Listar contatos
    public void getContatos() {
        System.out.print("[");
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                break;
            }
            System.out.print(agenda[i]);

            if (i < tamanho - 1) {
                System.out.print(",\n ");
            }
        }
        System.out.println("]");
    }



    // Excluir um contato
    public void removeContato(Contato nome) {
        for (int i = 0; i < tamanho; i++) {
            if (agenda[i].equals(nome)) {
                remover(i);
            }
        }
        agenda[tamanho-1] = null;
        tamanho--;
        reduzir();
    }


    // Buscar Contato
    public String getContato(String valor) {
        StringBuilder sb = new StringBuilder();

        int encontrados = 0;
        for (Contato c : agenda) {
            if (c != null) {
                if (c.getNome().equals(valor)) {
                    encontrados++;
                    sb.append(c).append("\n");
                } else if (c.getTelefone().equals(valor)) {
                    encontrados++;
                    sb.append(c).append("\n");
                }
            }
        }
        sb.append("Na agenda existe ").append(encontrados).append(" contato(s) com o valor ").append(valor).append("na agenda");
        return sb.toString();
    }

    // Atualizar Contato
    public void updateContato(Contato nome, TipoDado dado, String novoValor) {
        for (Contato c : agenda) {
            if (c != null) {
                if (c.equals(nome)) {
                    switch (dado) {
                        case NOME:
                            c.setNome(novoValor);
                            break;
                        case TELEFONE:
                            c.setTelefone(novoValor);
                        case EMAIL:
                            c.setEmail(novoValor);
                        default:
                            break;
                    }
                }
            }
        }
    }

    // Buscar por prefixo
    public String buscarPrefixo(String valor) {
        StringBuilder sb = new StringBuilder();

        int encontrados = 0;
        for (Contato c : agenda) {
            if (c != null) {
                if (c.getNome().startsWith(valor)) {
                    encontrados++;
                    sb.append(c).append("\n");
                }
            }
        }
        sb.append("Na agenda existe " + encontrados + " contato(s) com o valor " + valor + " na agenda.");
        return sb.toString();
    }


    //Adcionar em lote
    public void addContatoLote(Contato[] contatos){
        for(Contato c :contatos ){
            addContato(c);
        }

    }

    public int getTamanho(){
        return agenda.length;
    }

}
