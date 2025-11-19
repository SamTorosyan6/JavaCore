package chapter14;

public class BoundsDemo {

    static void main() {

        Integer [] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);

        double v = iOb.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double [] dNums  = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<Double>(dNums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно " + w);

    }
}
