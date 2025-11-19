package chapter14;

public class SimpGen {

    static void main() {

        TwoGen<Integer,String> tgObj = new TwoGen<>(88,"Обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Значение:" + v);

        String str = tgObj.getOb2();
        System.out.println("Значение:" + str);

    }

}
