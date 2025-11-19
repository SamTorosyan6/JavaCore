package chapter14;

public class NonGenDemo {

    static void main() {

        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();

        System.out.println("Знaчeниe: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Tecт без обобщений");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe: " + str);

        iOb = strOb;

    }


}
