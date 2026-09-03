package ads.esd;

public class VetorDinamico {
    private int tamanho;
    private String [] elementos;

    public VetorDinamico(int quantidade){
        elementos = new String[quantidade];
        this.tamanho = 0;
    }

    public void inserir(String elemento){
        if(tamanho == elementos.length){
            expandir();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void expandir(){
        String[] novo = new String[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    public void reduzir(){
        if(tamanho <= elementos.length/4) {
            String[] novo = new String[elementos.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }


    }

    public void remover(int indice){
        if(indice < 0 || indice >= tamanho){
            System.out.println("Indice Inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
        reduzir();

    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (elemtnos[i].equals(nome)) {
                remover(i);
            }
        }
        remover[tamanho-1] = null;
        tamanho--;
        reduzir();
    }

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





    public void imprimir(){
        System.out.print("[");
        for (int i = 0; i < elementos.length; i++) {
//            if(elementos[i] == null){
//                break;
//            }
            System.out.print(elementos[i]);

            if(i< elementos.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}