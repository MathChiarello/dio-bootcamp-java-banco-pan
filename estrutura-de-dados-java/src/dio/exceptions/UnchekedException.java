package dio.exceptions;

import javax.swing.*;

public class UnchekedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a) , Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada invalida , informe um numero inteiro! Erro: " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Nao pode dividir um numero por zero! Erro: " + e.getMessage());
            }
            finally {
                System.out.println("Chegou no finally!");
            }

        } while (continueLooping);

        System.out.println("Codigo finalizado!");
    }
    public static int dividir(int a , int b){
        return a / b;
    }
}