package dio.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("Ordem Natural");
        System.out.println(meusGatos);
        System.out.println("------------------------");

        System.out.println("Ordem Aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("------------------------");

        System.out.println("Ordem utilizando o comparable por Nome");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("------------------------");

        System.out.println("Ordem utilizando o comparable por Idade");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("------------------------");

        System.out.println("Ordem utilizando o comparable por Cor");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("------------------------");

        System.out.println("Ordem utilizando o comparable por Nome, Cor e Idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        System.out.println("------------------------");
    }
}
