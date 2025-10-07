package homework.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dA = new DynamicArray();
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

        System.out.println();

        dA.deleteByIndex(7);

        System.out.println();
        System.out.println();

        dA.set(6,666);

        System.out.println();
        System.out.println();

        dA.add(1,44);

        System.out.println();
        System.out.println();

        System.out.println(dA.exists(8));

        System.out.println();

        System.out.println(dA.getIndexByValue(44));

    }

}
