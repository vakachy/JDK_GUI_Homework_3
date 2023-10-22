/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.
 */
package Pair;

public class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public String toString() {
        return String.format("This instance of class Pair consists of:\nthe First value: %s, %s\nand\n" +
                        "the Second value: %s, %s.", first.toString(), first.getClass().getSimpleName(), second.toString(),
                second.getClass().getSimpleName());
    }
}

class Program {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "5");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
