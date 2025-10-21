package chapter9;

public class TestIface2 {

    static void main() {

        Callback c = new Client();
        AnotherClass ob = new AnotherClass();

        c.callBack(42);
        c = ob;

        c.callBack(42);
    }

}
