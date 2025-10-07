package homework.dynamicarray;

public class DynamicArray {

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

    public void deleteByIndex(int index) {

        if (index >= 0 && index < size) {

            for (int j = index; j < size; j++) {

                array[j] = array[j + 1];

            }

            System.out.println("Array elements without the index we specified։ ");

            for (int x : array) {

                System.out.print(x + " ");

            }

        } else {

            System.out.println("There is no such element!");

        }

    }

    public void set(int index, int value) {


        if (index >= 0 && index < size) {

            array[index] = value;

            System.out.println("The value we added to the index we mentioned");

            for (int x : array) {

                System.out.print(x + " ");

            }

        } else {

            System.out.println("There is no such element!");

        }

    }

    public void add(int index, int value) {

        int temp = value;

        if (index < 0 || index > size) {
            System.out.println("Չկա նման ինդեքս!");
            return;
        }

        if (size == array.length) {
            extend();
        }

        for (int i = index; i <= size; i++) {

            int next = array[i];

            array[i] = temp;

            temp = next;

        }

        size++;

        System.out.println("We add a preferred value to our chosen index");

        for (int x : array) {

            System.out.print(x + " ");

        }

    }

    public boolean exists(int value) {

        for (int i : array) {

            if (i == value) {

                return true;

            }

        }

        return false;
    }

    public int getIndexByValue(int value) {

        for (int i = 0; i < size; i++) {

            if (array[i] == value) {

                return i;

            }

        }

        return -1;
    }


}


