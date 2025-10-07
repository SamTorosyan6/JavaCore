package chapter7;

public class AccessTest {

    static void main() {

        Test2 ob = new Test2();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);

        System.out.println("a, b, и  c: " + ob.a + " " + ob.b + " " + ob.getC());

    }

}
