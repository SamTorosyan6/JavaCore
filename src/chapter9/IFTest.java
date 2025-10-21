package chapter9;

public class IFTest {

    static void main() {

        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 8; i++) {

            myStack2.push(i);

        }

        System.out.println("стек в mystack1");
        for (int i = 0; i < 5; i++) {

            System.out.println(myStack1.pop());

        }

        System.out.println("стек в mystack2");
        for (int i = 0; i < 8; i++) {

            System.out.println(myStack2.pop());

        }
    }

}
