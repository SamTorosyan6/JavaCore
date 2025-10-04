package chapter7;

public class RetOb {

    static void main() {

        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();

        System.out.println("ob1.a " + ob1.a);
        System.out.println("ob2.a " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("оb2.а после второго увеличения значения: " + ob2.a);

    }

}
