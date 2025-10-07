package chapter7;

public class VarArgs {

    static void vaTest(int ... v) {

        System.out.println("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v) {

            System.out.println(x + " ");
            System.out.println();

        }

    }

    static void main() {

        vaTest(10);
        vaTest(1,2,3);
        vaTest();

    }

}
