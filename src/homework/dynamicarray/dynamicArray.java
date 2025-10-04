package homework.dynamicarray;

public class dynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {

        if (size == array.length) {

            extend();

        }
        array[size++] = value;

    }

    private void extend() {

        int index = 0;
        int[] newArray = new int[array.length + 10];

        for (int i : array) {

            newArray[index] = i;
            index++;

        }

        array = newArray;

    }

    public int getByIndex(int index) {

        if (index >= 0 && index <= array.length - 1) {

            return array[index];

        } else {
            return -1;
        }

    }

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}


