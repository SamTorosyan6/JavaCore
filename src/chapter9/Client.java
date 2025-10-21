package chapter9;

public class Client implements Callback {

    @Override
    public void callBack(int p) {

        System.out.println("Meтoд callback(), " + " вызываемый со значением " + p);

    }

    void nonIfaceMeth(){

        System.out.println("B классах, реализующих интерфейсы," + "могут определяться и другие члены.");

    }
}
