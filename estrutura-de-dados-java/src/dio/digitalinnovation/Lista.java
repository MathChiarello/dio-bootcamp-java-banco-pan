package dio.digitalinnovation;
import java.util.*;

public class Lista {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(7d); // O caractere "d" serve para informar que é um double
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Exiba as notas do aluno: ");
        System.out.println(notas);

        System.out.println("___________________________________________");

        System.out.println("Exiba a posicao da nota 5.0: ");
        System.out.println("Posicao " + notas.indexOf(5d)); // indexOf informa a posição solicitada

        System.out.println("___________________________________________");

        System.out.println("Adicione na lista a nota 8.0 na posicao 4:");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("___________________________________________");

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        int posicao = notas.indexOf(5d);
        notas.set(posicao , 6d);
        System.out.println(notas);

        System.out.println("___________________________________________");

        System.out.println("Confira se a nota 5.0 esta na lista:");
        System.out.println(notas.contains(5d));

        System.out.println("___________________________________________");

        System.out.println("Exiba todas as notas na ordem em que foram informados:");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("___________________________________________");

        System.out.println("Exiba a terceira nota informada:");
        System.out.println(notas.get(2));

        System.out.println("___________________________________________");

        System.out.println("Exiba a menor nota:");
        System.out.println(Collections.min(notas));

        System.out.println("___________________________________________");

        System.out.println("Exiba a maior nota:");
        System.out.println(Collections.max(notas));

        System.out.println("___________________________________________");

        System.out.println("Exiba a soma dos valores:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        Double somaNoFor = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        for (int i = 0; i < notas.size(); i++) somaNoFor += notas.get(i); // MUITO MAIS FÁCIL QUE O ITERATOR

        System.out.println(soma);
        System.out.println(somaNoFor);

        System.out.println("___________________________________________");

        System.out.println("Exiba a media das notas:");
        System.out.println(soma / notas.size());

        System.out.println("___________________________________________");

        System.out.println("Remova a nota 0:");
        System.out.println(notas.remove(0d));

        System.out.println("___________________________________________");

        System.out.println("Remova a nota na posicao 0:");
        System.out.println(notas.remove(0));

        System.out.println("___________________________________________");

        System.out.println("Remova as notas menores que 7 e exiba a lista:");

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("___________________________________________");

        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("___________________________________________");

        System.out.println("Confira se a lista está vazia:");
        System.out.println(notas.isEmpty());

        System.out.println("___________________________________________");
    }
}
