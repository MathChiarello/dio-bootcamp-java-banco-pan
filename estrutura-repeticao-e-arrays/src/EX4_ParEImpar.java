import java.util.Scanner;

public class EX4_ParEImpar {
    
    public static void main(String[] args) {
        
        System.out.println("================= EXERCÍCIO 4 - PAR E IMPAR ====================");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números");
        int qtde = sc.nextInt();
        int numero = 0;
        int EhPar = 0;
        int EhImpar = 0;

        for (int i = 0; i < qtde; i++) {

            numero = sc.nextInt();
            if ((numero % 2) == 0) {
                EhPar++;
            } else {
                EhImpar++;
            }
        }

        System.out.println("Números Pares: " + EhPar);
        System.out.println("Números Impares: " + EhImpar);
    }
}
