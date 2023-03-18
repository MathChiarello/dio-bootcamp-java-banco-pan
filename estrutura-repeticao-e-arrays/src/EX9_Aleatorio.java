import java.util.Random;

public class EX9_Aleatorio {
 
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("======= NUMEROS ALEATÓRIOS =======");
        for (int i : numerosAleatorios) {
            System.out.print(i + ",");
        }
        
        System.out.println();

        System.out.println("======= NUMEROS ALEATÓRIOS SUCESSORES =======");
        for (int i : numerosAleatorios) {
            System.out.print((i+1) + ",");
        }



    }
}
