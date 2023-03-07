/**
 * TesteIfTernario
 */
public class TesteIfTernario {

    public static void main(String[] args) {

        
        int a, b;

        a = 5;
        b = 6;

// USANDO O IF TERNÁRIO

String resultado = a == b ? "verdadeiro" : "falso";
System.out.println(resultado);

// FORMA ANTIGA DE FAZER E MAIOR!!!!

        if (a == b) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}