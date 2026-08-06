package org.example;


public class VetorDeLista {

    private VetorEstatico[] nomerporLetra;

    public VetorDeLista(){
        nomerporLetra = new VetorEstatico[26];
        for (int i = 0; i < nomerporLetra.length; i++) {
            nomerporLetra[i] = new VetorEstatico(20);
        }

    }


    public void inserir(String nome){
        char letra = Character.toUpperCase(nome.charAt(0));
        int indice = letra - 'A';

        nomerporLetra[indice].inserir(nome);
    }

    public void imprimir(){
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('A' + i);
            System.out.print(letra + " ");
            nomerporLetra[i].imprimir();
        }
    }
}
