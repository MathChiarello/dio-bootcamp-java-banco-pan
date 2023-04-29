package DesafiosFinais;

import java.util.Scanner;

public class QuitandaDoSeuZe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double valorFinalMorangos;
        double valorFinalMacas;
        double valorFinal;
        int kgFinal;

        if(morangos <= 5){
            valorFinalMorangos = morangos * 2.50;
        } else valorFinalMorangos = morangos * 2.20;

        if(macas <= 5){
            valorFinalMacas = macas * 1.80;
        } else valorFinalMacas = macas * 1.50;

        valorFinal = valorFinalMacas + valorFinalMorangos;
        kgFinal = macas + morangos;

        if(valorFinal > 25 | kgFinal > 8){
            valorFinal =  valorFinal - (valorFinal * 0.1);
        }

        System.out.println(valorFinal);



    }
}
