package org.example;


public class Main {
    static void main() {
        VetorDinamico vetor = new VetorDinamico(2);
        vetor.inserir("ana0");
        vetor.inserir("ana");
        vetor.imprimir();

        //expandir
        vetor.inserir("ana");
        vetor.imprimir();
        vetor.inserir("ana");
        vetor.inserir("ana");
        vetor.inserir("ana");


        //expandir
        vetor.inserir("ana");
        vetor.imprimir();
        vetor.inserir("ana");
        vetor.inserir("ana");
        vetor.imprimir();
        vetor.remover(0);
        vetor.imprimir();
        vetor.remover(0);
        vetor.remover(0);
        vetor.remover(0);
        vetor.remover(0);

        vetor.imprimir();
        vetor.remover(0);
        vetor.remover(0);
        vetor.imprimir();
        vetor.remover(0);
        vetor.imprimir();





    }
}
