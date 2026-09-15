package ads.esd;

public class Main {
    static void main() {
        //Utilizando a pilha inplementada do zero
        Pilha<Integer> p = new Pilha<Integer>(20);
        System.out.println(" Pilha está vazia: " + p.isEmpty());
        p.push(2);
        System.out.println(" Pilha está vazia: " + p.isEmpty());
        p.push(5);
        p.push(1);
        p.pop();
        int valor = p.pop();
        System.out.println("Segundo valor desempilhado: " + valor);
        p.pop();
        System.out.println(" Pilha está vazia: " + p.isEmpty());
        p.pop();
    }
}
