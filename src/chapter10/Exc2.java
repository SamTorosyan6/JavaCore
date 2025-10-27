package chapter10;

public class Exc2 {

    static void main() {

        int d, a;

        try {

            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {

            System.out.println("Деление на нуль");

        }
        System.out.println("Пocлe оператора catch.");
    }
}
