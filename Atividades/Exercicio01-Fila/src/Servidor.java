import java.util.Random;

public class Servidor {



    public void executar(int ciclos, Fila<Requisicoes> fila, int processadores, int n) {
         Requisicoes req;
         int perdidas = 0;
         int total = 0;
         int sucesso = 0;
         Random random = new Random();

        for (int i = 0; i < ciclos; i++) {
            int quantidade = random.nextInt(n);

            for (int j = quantidade; j > 0; j--) {
                total++;
                boolean enfileirou = fila.enfileirar(new Requisicoes(j));
                if(!enfileirou) perdidas++;
            }

            for (int j = 0; j < processadores; j++) {
                try{
                    fila.desenfileirar();
                    sucesso++;
                }catch (RuntimeException _){}
            }

        }


        System.out.println("Total: "+ total);
        System.out.println("Sucesso: " + sucesso);
        System.out.println("Perdidas: " + perdidas);
        double porcentagem = ((double) sucesso /total) * 100;
        System.out.println("Porcentagem de sucesso: "+ porcentagem );
        System.out.println("---------------------------");
    }

}
