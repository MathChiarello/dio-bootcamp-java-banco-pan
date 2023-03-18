import java.util.Random;

public class EX10_MatrizMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] matriz = new int[4][3];

        for (int l = 0; l < matriz.length; l++) {

            for (int c = 0; c < matriz[l].length; c++) {

                int num1 = random.nextInt(9);
                matriz[l][c] = num1;
            }
        }


        System.out.println("Matriz: ");

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");

            }

            System.out.println();
        }

    }
}
