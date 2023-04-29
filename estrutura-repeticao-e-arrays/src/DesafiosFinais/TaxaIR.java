package DesafiosFinais;

import java.io.IOException;
import java.util.Scanner;

public class TaxaIR {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        if(renda > 4500d){
            imposto = ((renda - 4500d) * 0.28) + 350;
            System.out.printf("R$ %.2f%n", imposto);
        } if(renda > 3000d & renda <= 4500d){
            imposto = ((renda - 3000d) * 0.18) + 80;
            System.out.printf("R$ %.2f%n", imposto);
        } if(renda > 2000d & renda <= 3000d) {
            imposto = ((renda - 2000d) * 0.08);
            System.out.printf("R$ %.2f%n", imposto);
        } if(renda <= 2000d) {
            System.out.println("Isento");
        }
    }
}
