import java.util.Scanner;

public class EX2_Nota {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nota = 0;

        System.out.println("Digite uma nota válida: ");
        nota = sc.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Invalida, digite outra nota!");
            nota = sc.nextInt();
        }
    }
}
