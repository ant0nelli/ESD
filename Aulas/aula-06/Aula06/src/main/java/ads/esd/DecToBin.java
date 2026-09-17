package ads.esd;

public class DecToBin {
    static void main(){
        Stack<Integer> pilha = new Stack<>(50);

        int numero = 19;

        while(numero > 0) {
            int resto = numero % 2;
            pilha.push(resto);
            numero = numero/2;
        }

        //Desempilhando para formar o binário
        StringBuilder sb = new StringBuilder();
        while(!pilha.isEmpty()){
            sb.append(pilha.pop());
        }
        System.out.println(sb.toString());

    }

}
