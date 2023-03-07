import java.util.Scanner;

    /*
    * EXERCÍCIO 1 - 🔸Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
    * o primeiro representando o nome do aluno e o segundo representando a sua idade. 
    * (Pare o programa inserindo o valor 0 no campo nome)
    */
public class EX1_NomeEIdade {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            String nome = "nada";
            int idade;
                
                while (true) {
                  
                    System.out.println("Digite um nome: ");
                    nome = sc.next();
                    if (nome.equals("0"))
                        break;
                    System.out.println("Digite sua idade: ");
                    idade = sc.nextInt();
                }
        }
        }
}
