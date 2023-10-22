/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа (но необязательно разного между собой),
над которыми должна быть произведена операция.
*/

package Calculator;

public class Calculator {

    private static Integer intSum;
    private static Float floatSum;
    private static Double doubleSum;
    private static Integer intSubtraction;
    private static Float floatSubtraction;
    private static Double doubleSubtraction;
    private static Integer intMultiplication;
    private static Float floatMultiplication;
    private static Double doubleMultiplication;
    private static Integer intDivision;
    private static Float floatDivision;
    private static Double doubleDivision;

    public static <U extends Number> void sum(U a, U b) {
        if (a instanceof Integer & b instanceof Integer) {
            intSum = (Integer) a + (Integer) b;
        } else if (a instanceof Float & b instanceof Float) {
            floatSum = (Float) a + (Float) b;
        } else doubleSum = (Double) a + (Double) b;
    }

    public static <U extends Number> void subtraction(U a, U b) {
        if (a instanceof Integer & b instanceof Integer) {
            intSubtraction = (Integer) a - (Integer) b;
        } else if (a instanceof Float & b instanceof Float) {
            floatSubtraction = (Float) a - (Float) b;
        } else doubleSubtraction = (Double) a - (Double) b;
    }

    public static <U extends Number> void multiply(U a, U b) {
        if (a instanceof Integer & b instanceof Integer) {
            intMultiplication = (Integer) a * (Integer) b;
        } else if (a instanceof Float & b instanceof Float) {
            floatMultiplication = (Float) a * (Float) b;
        } else doubleMultiplication = (Double) a * (Double) b;
    }

    public static <U extends Number> void divide(U a, U b) {
        if (a instanceof Integer & b instanceof Integer) {
            if ((Integer) b != 0) {
                intDivision = (Integer) a / (Integer) b;
            }

        } else if (a instanceof Float & b instanceof Float) {
            if ((Float) b != 0) {
                floatDivision = (Float) a / (Float) b;
            }

        } else if ((Double) b != 0) {
            doubleDivision = (Double) a / (Double) b;
        }
    }

    public static Integer getIntSum() {
        return intSum;
    }

    public static Float getFloatSum() {
        return floatSum;
    }

    public static Double getDoubleSum() {
        return doubleSum;
    }

    public static Integer getIntSubtraction() {
        return intSubtraction;
    }

    public static Float getFloatSubtraction() {
        return floatSubtraction;
    }

    public static Double getDoubleSubtraction() {
        return doubleSubtraction;
    }

    public static Integer getIntMultiplication() {
        return intMultiplication;
    }

    public static Float getFloatMultiplication() {
        return floatMultiplication;
    }

    public static Double getDoubleMultiplication() {
        return doubleMultiplication;
    }

    public static Integer getIntDivision() {
        return intDivision;
    }

    public static Float getFloatDivision() {
        return floatDivision;
    }

    public static Double getDoubleDivision() {
        return doubleDivision;
    }
}

