import java.util.Scanner;


public class EX6_Fatorial {
    


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Informe o número: ");

        int numero = sc.nextInt();
        int fatorial = numero;

        for (int i = 1; i < numero; i++) {
            fatorial = fatorial * i;
        }
        
        System.out.println("Fatorial: " + fatorial);

    }

}
