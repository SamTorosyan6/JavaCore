package homework.dynamicarray;

public class dynamicArrayDemo {

    public static void main(String[] args) {

        dynamicArray dA = new dynamicArray();
        dA.add(15);
        dA.add(1);
        dA.add(56);
        dA.add(14);
        dA.add(8);
        dA.add(6);
        dA.add(95);
        dA.add(11);
        dA.add(7);
        dA.add(23);
        dA.add(2);

        dA.getByIndex(18);

        dA.print();

    }

}
