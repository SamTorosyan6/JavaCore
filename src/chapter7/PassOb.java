package chapter7;

public class PassOb {

    static void main() {

        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equalsTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalsTo(ob3));

    }

}
