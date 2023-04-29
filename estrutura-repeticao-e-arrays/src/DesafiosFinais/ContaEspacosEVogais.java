package DesafiosFinais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1;
        int quantVogais = 0;

        String strLC = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = strLC.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                quantVogais++;
            }
        }


        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}

//
//                palavra.add(item);
//                for (String letra : palavra){
//                if (
//                letra.toLowerCase().equals("a") ||
//                letra.toLowerCase().equals("e") ||
//                letra.toLowerCase().equals("i") ||
//                letra.toLowerCase().equals("o") ||
//                letra.toLowerCase().equals("u")
//                ) {
//                quantVogais++;
//                System.out.println("Vogal");