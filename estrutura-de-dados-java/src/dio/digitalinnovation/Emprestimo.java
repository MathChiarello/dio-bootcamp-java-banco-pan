package dio.digitalinnovation;

public class Emprestimo {

    double valorEmprestimo = 0;
    double taxa = 0;
    int parcelas = 10;
    double novoValor = 0;

    public double valorFinal() {
        double result = novoValor = (novoValor + (valorEmprestimo * taxa)) / parcelas;
        return result;
    }

}