package dio.digitalinnovation;

public class Calculadora {

    private int num1;
    private int num2;


    public static int adicao(int getNum1, int getNum2) {
        return getNum1 + getNum2;
    }

    public static int subtracao(int getNum1, int getNum2) {
        return getNum1 - getNum2;
    }

    public static int multiplicao(int getNum1, int getNum2) {
        return getNum1 * getNum2;
    }

    public static int divisao(int getNum1, int getNum2) {
        if (getNum2 == 0) {
            System.out.println("O valor não pode ser dividido por zero");
            return 0;
        } else {
            return getNum1 / getNum2;    
        }
    
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


}
