package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator.sum(5, 6);
        System.out.println(Calculator.getIntSum());
        Calculator.sum(5.0, 6.0);
        System.out.println(Calculator.getDoubleSum());
        Calculator.sum(1.2f, 3.5f);
        System.out.println(Calculator.getFloatSum());

        System.out.println();

        Calculator.subtraction(5, 6);
        System.out.println(Calculator.getIntSubtraction());
        Calculator.subtraction(5.0, 0.6);
        System.out.println(Calculator.getDoubleSubtraction());
        Calculator.subtraction(5.0f, 6.0f);
        System.out.println(Calculator.getFloatSubtraction());

        System.out.println();

        Calculator.multiply(5, 6);
        System.out.println(Calculator.getIntMultiplication());
        Calculator.multiply(5.0f, 6.0f);
        System.out.println(Calculator.getFloatMultiplication());
        Calculator.multiply(5.0, 6.1);
        System.out.println(Calculator.getDoubleMultiplication());

        System.out.println();

        Calculator.divide(5, 6);
        System.out.println(Calculator.getIntDivision());
        Calculator.divide(5.0f, 6.0f);
        System.out.println(Calculator.getFloatDivision());
        Calculator.divide(5.0, 6.0);
        System.out.println(Calculator.getDoubleDivision());
    }
}
