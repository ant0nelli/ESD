package ads.esd;


public class VetorEstatico{
    private String[] elementos;
    private int tamanho = 0;

    public VetorEstatico(int quantidade){
        elementos = new String[quantidade];
    }

// Versão 1
//    public void inserir(String elemento){
//        for(int i =0; i < elementos.length; i++){
//            if(elementos[i] == null){
//                elementos[i] = elemento;
//                return;
//            }
//        }
//        System.out.println("Não existe posição disponível para adicionar informação");
//    }


// Versão 2
//    public void inserir(String elemento){
//        if(tamanho < elementos.length){
//            elementos[tamanho] = elemento;
//            tamanho++;
//        }else System.out.println("Não existe posição disponível");
//
//    }


    //Versão 3
    public void inserir(int indice, String elemento){
        if(tamanho >= elementos.length){
            System.out.println("Vetor cheio");
            return;
        }
        if (indice < 0 || indice > elementos.length){
            System.out.println("Posição Inválida");
            return;
        }
        for (int i = tamanho; i > indice; i--) { //***
            elementos[i] = elementos[i-1];
        }
        elementos[indice] = elemento;
        tamanho++;
    }

    //Remover último elemento
    public void removerUltimo(){
        if(tamanho > 0){
            elementos[tamanho-1] = null;
            tamanho--;
        }else{
            System.out.println("Vetor está vazio");
        }

    }

    //Obter o tamanho do array
    public int obterTamanho(){
        return tamanho;
    }

    //Ler um elemento do array
    public String ler(int indice){
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        }else {
            throw  new IndexOutOfBoundsException("Indice inválido");
        }
    }

    //Remover um elemento do array
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

    }

    //Remover passando objeto
    public void remover(String elemento){
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)){
                remover(i);
                return;
            }
        }
    }

    //Imprimir todo o array
    public void imprimir(){
        System.out.print("[");
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i] == null){
                break;
            }
            System.out.print(elementos[i]);

            if(i<tamanho -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}