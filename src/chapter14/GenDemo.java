package chapter14;

public class GenDemo {

    static void main() {

        Gen<Integer> genInteger = new Gen<>(88);
        genInteger.showType();

        int v = genInteger.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        Gen<String> genString = new Gen<>("Тест сообщений");
        genString.showType();
        String str = genString.getOb();
        System.out.println("Значение: " + str);




    }

}
