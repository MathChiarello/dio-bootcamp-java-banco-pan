package DesafiosFinais;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double area;
        double soma;
        boolean triangulo = (A + B) > C & (B + C) > A & (C + A) > B;

        if(triangulo){
            soma = A + B + C;
            System.out.printf("Perimetro = %.1f%n", soma);
        } else {
            area = (((A + B) * C) / 2);
            System.out.printf("Area = %.1f%n", area);
        }

    }
}
