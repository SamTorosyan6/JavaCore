package chapter9;

public class IFTest2 {

    static void main() {

        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 20; i++) {

            myStack2.push(i);

        }

        System.out.println("стек в mystack1");
        for (int i = 0; i < 12; i++) {

            System.out.println(myStack1.pop());

        }

        System.out.println("стек в mystack2");
        for (int i = 0; i < 20; i++) {

            System.out.println(myStack2.pop());

        }
    }

}
