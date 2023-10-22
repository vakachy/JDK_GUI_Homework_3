/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа.
*/

package CompareArrays;

public class Compare {
    public <T> boolean compareArrays(T[] a, T[] b) {
        if (a != null && b != null && a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (!a[i].equals(b[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Object[] a = {"", ""};
        Object[] b = {"", ""};

        Number[] numbers1 = {1, 1.2, 2.3f};
        Number[] numbers2 = {1, 1.2, 2.3f};

        Worker[] wA1 = {new Worker(), new Worker()};
        Worker[] wA2 = {new Worker(), new Worker()};
        Worker[] wA3 = wA1;

        Compare compare = new Compare();
        System.out.println(compare.compareArrays(a, b));
        System.out.println();
        System.out.println(compare.compareArrays(wA1, wA2));
        System.out.println();
        System.out.println(compare.compareArrays(wA1, wA3));
        System.out.println();
        System.out.println(compare.compareArrays(numbers1, numbers2));
    }
}

class Worker {
    private final String name;

    public Worker() {
        name = "Name";
    }
}

