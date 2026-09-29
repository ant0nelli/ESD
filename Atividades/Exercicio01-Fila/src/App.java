import java.util.Random;

public class App {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>(100);
        int perdidas = 0;
        int total = 0;
    

        // Processadores
        int processadores = 5;


        Random random = new Random();
        
        //1000 Ciclos
        for (int i = 0; i < 1000; i++) {
            int quantidade = random.nextInt(11);

            for (int j = quantidade; j > 0; j--) {
                total++;
                boolean enfileirou = fila.enfileirar(0);
                if(!enfileirou) perdidas++;
            }
            
            for (int j = 0; j < processadores; j++) {
                try{ 
                    fila.desenfileirar();
                }catch (RuntimeException e){}
            }
            
            

        }

    

        System.out.println("Perdidas: " + perdidas);
        System.out.println("Total: "+ total);
    }

}
