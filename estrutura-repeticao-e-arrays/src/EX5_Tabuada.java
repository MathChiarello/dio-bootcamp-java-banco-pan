import java.util.Scanner;

public class EX5_Tabuada {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual tabuada deseja:");
        int t = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(t + " * " + i + " = " + (t*i));
        }


    }

}
