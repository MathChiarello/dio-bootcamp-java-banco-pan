package dio.digitalinnovation;

public class Testes {
    public static void main(String[] args) {

        /*
        
        // TESTES DA CALCULADORA
        
        Calculadora ope = new Calculadora();
        
        int soma = Calculadora.adicao(10, 5);
        System.out.println(soma);
        
        int subtracao = Calculadora.subtracao(10, 5);
        System.out.println(subtracao);
        
        int multiplicao = Calculadora.multiplicao(10, 5);
        System.out.println(multiplicao);
        
        int divisao = Calculadora.divisao(10, 5);
        System.out.println(divisao);
        
        int divisaoPorZero = Calculadora.divisao(10, 0);
        System.out.println(divisaoPorZero);
        
        
        
        // TESTES DE SAUDAÇÃO
        
        Saudacao oi = new Saudacao();
        
        // int hora = oi.setHoraDoDia(15);
        // System.out.println(hora);
        
        
        String dia = oi.saudacao(5);
        System.out.println(dia);
        
        String tarde = oi.saudacao(14);
        System.out.println(tarde);
        
        String noite = oi.saudacao(23);
        System.out.println(noite);
        
        String erro1 = oi.saudacao(-5);
        System.out.println(erro1);
        
        String erro2 = oi.saudacao(37);
        System.out.println(erro2);
        
        */
        
        Emprestimo emp = new Emprestimo();

        emp.parcelas = 10;
        emp.valorEmprestimo = 2000;
        emp.taxa = 0.22;

        emp.valorFinal();
        

    }
}
