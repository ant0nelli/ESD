package ads.esd;


public class VetorLista {

    private VetorDinamico[] nomesporLetra;

    public void VetorDeLista(){
        nomesporLetra = new VetorDinamico[26];
        for (int i = 0; i < nomesporLetra.length; i++) {
            nomesporLetra[i] = new VetorDinamico(20);
        }

    }


    public void inserir(String nome){
        char letra = Character.toUpperCase(nome.charAt(0)); //a
        int indice = letra - 'A'; //0
        nomesporLetra[indice].inserir(nome);
    }

    public void remover(String nome){
        char letra = Character.toUpperCase((nome.charAt(0));
        int indice = letra - 'A';
        nomesporLetra[indice].removerPorNome(nome);
    }

    public void buscarPorNome(String nome){
        for (int i = 0; i < 26; i++) {
            char letraAtual = (char) ('A' + i);
            char letraDesejada = Character.toUpperCase(nome.charAt(0));

            if(letraAtual == letraDesejada){
                nomesporLetra[i].getContato(nome);
            }

        }
    }


    public void updateContato(String nome, String telefone) {
        

    }

}