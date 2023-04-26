package dio.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteMELI {
    public static void main(String[] args) {
        int maxDigit = 6;
        int somaFinal = 21;
        int tamanho = 4;
        //int num = 1004;
        int soma = 0;
        List<Integer> numeroEmLista = new ArrayList<>();
        List<Integer> listaDosNumerosCertos = new ArrayList<>();
        List<Integer> listaTop = new ArrayList<>();

        for (int num = 1000; num <= 9999; num++) {

            // CONVERTER O NÚMERO EM STRING
            String testeCertoStr = String.valueOf(num);
            // "SPLITAR" O NÚMERO EM UMA LISTA PARA CONSEGUIR OLHAR OS NÚMEROS SEPARADAMENTE
            String[] itens = testeCertoStr.split("");

            // SEPAREI E INCLUI EM UMA LIST
            for (String item : itens) {
                int numeroConvertidoEmInt = Integer.valueOf(item);
                numeroEmLista.add(numeroConvertidoEmInt);
            }
            //System.out.println(numeroEmLista);

            // VERIFICANDO SE A SOMA DOS NÚMEROS DA MAIS QUE 21
            for (int i = 0; i < numeroEmLista.size(); i++) {
                soma += numeroEmLista.get(i);
                if (soma == somaFinal & Collections.max(numeroEmLista) <= maxDigit) listaTop.add(num);
            }
            numeroEmLista.clear();
            soma = 0;

        }
        System.out.println(listaTop);
    }
}
