package chapter7;

public class Overload {

    public static void main(String[] args) {

        OverloadDemo oD = new OverloadDemo();
        double result;
        int i = 88;

        oD.test();
        oD.test(10);
        oD.test(10,20);
        result = oD.test(123.25);

        System.out.println("Результат вызова ob.test(123.25): " + result);


    }

}
