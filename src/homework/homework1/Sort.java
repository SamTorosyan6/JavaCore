package homework.homework1;

public class Sort {

    public static void main(String[] args) {

        int[] array = {4, 7, 1, 3, 9, 0, 2};
        int temp = 0;
        boolean transfer = true;

        while (transfer) {

            transfer = false;

            for (int i = 0; i < array.length - 1; i++) {

                temp = array[i];

                if (array[i] > array[i + 1]) {

                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    transfer = true;

                }
            }
        }

        for (int arr : array) {

            System.out.print(arr + " ");

        }


    }

}
