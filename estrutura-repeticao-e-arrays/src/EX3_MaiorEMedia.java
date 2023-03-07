import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * EX3_MaiorEMedia
 */
public class EX3_MaiorEMedia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //List<Integer> Lista = new ArrayList<>(); 
        int numero = 0;
        int maior = 0;
        int soma = 0;
        System.out.println("Escreva cinco números: ");
        
        for (int i = 0; i < 5; i++) {
            numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }

            soma = soma + numero;
        }

        System.out.println("Soma dos Números: " + soma);
        System.out.println("Maior Número: " + maior);
        System.out.println("Média dos Números: " + soma/5);
    }
}