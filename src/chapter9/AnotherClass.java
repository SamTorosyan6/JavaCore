package chapter9;

public class AnotherClass implements Callback {

    @Override
    public void callBack(int p) {

        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));

    }
}
