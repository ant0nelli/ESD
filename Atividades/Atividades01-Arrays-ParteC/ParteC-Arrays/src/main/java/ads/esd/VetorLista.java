package ads.esd;


public class VetorLista {

    private VetorDinamico[] nomesporLetra;

    public void VetorDeLista(){
        nomesporLetra = new VetorDinamico[26];
        for (int i = 0; i < nomesporLetra.length; i++) {
            nomesporLetra[i] = new VetorDinamico(20);
        }

    }


    public void inserir(Contato contato){
        char letra = Character.toUpperCase(contato.getNome().charAt(0)); //a
        int indice = letra - 'A'; //0
        nomesporLetra[indice].inserir(contato);
    }

    public void remover(String nome){
        char letra = Character.toUpperCase(nome.charAt(0));
        int indice = letra - 'A';
        System.out.println(nomesporLetra[indice].removerPorNome(nome));
        
    }

    public String buscarPorNome(String nome){
        
            char letraDesejada = Character.toUpperCase(nome.charAt(0));
            int indice = letraDesejada - 'A';
            
            String resultado = nomesporLetra[indice].getContato(nome);
            return resultado;

        
    }


    public void updateContato(String nome, String telefoneNovo) {
        char letra = Character.toUpperCase(nome.charAt(0));
        int indice = letra - 'A';
        System.out.println(nomesporLetra[indice].updateContato(nome, telefoneNovo));
    }

}