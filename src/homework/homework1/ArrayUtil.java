package homework.homework1;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        //1.Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println();

        //2.Տպել մասիվի առաջին էլեմենտը
        System.out.println("Մասիվի առաջին էլեմենտը " + numbers[0] + "-ն է");

        System.out.println();

        //3.Տպել մասիվի վերջին էլեմենտը
        int lastNum = numbers[numbers.length - 1];
        System.out.println("Մասիվի վերջին էլեմենտը " + lastNum + "-ն է");
        System.out.println();

        //4.Տպել մասիվի երկարությունը

        System.out.println("Մասիվի երկարությունը " + numbers.length + " է");

        System.out.println();

        //5․Տպել մասիվի ամենափոքր թիվը

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {

                min = numbers[i];

            }

        }

        System.out.println("Մասիվի ամենափոքր թիվը " + min + "ն է");

        System.out.println();

        //6.Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ
        // հավասար էղավ, տպեք որ can't print middle values. եթե զույգ է մասիվի մեջի
        // էլեմենտների թիվը, տպեք մեջտեղի երկու էլեմենտները, եթե կենտ է մի հատը։

        int midIndex = numbers.length / 2;
        int midNumEven = numbers[midIndex];
        int midNumOdd = numbers[midIndex - 1];

        if (numbers.length <= 2) {

            System.out.println("Can't print middle values");

        } else if (numbers.length % 2 == 0) {
            System.out.println("Մասիվի թվերի քանակը զույգ է՝ մեջտեղի թվերն են։ " + midNumOdd + "-ը և " + midNumEven);

        } else if (numbers.length % 2 == 1) {
            System.out.println("Մասիվի թվերի քանակը կենտ է՝ մեջտեղի թիվն է։ " + midNumEven);
        }

        System.out.println();

        //7․Հաշվել ու տպել մասիվում զույգերի քանակը։

        int countOfEvens = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                countOfEvens += 1;
            }

        }

        System.out.println("Մասիվում զույգ թվերի քանակը։ " + countOfEvens);

        System.out.println();

        //8․Հաշվել ու տպել մասիվում կենտերի քանակը։

        int countOfOdds = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 1) {
                countOfOdds += 1;
            }

        }

        System.out.println("Մասիվում կենտ թվերի քանակը։ " + countOfOdds);

        System.out.println();

        //9.Տպել մասիվում էլեմենտների գումարը։

        int sumOfNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {

            sumOfNumbers += numbers[i];

        }

        System.out.println("Մասիվում բոլոր էլեմենտների գումարը։ " + sumOfNumbers);

        System.out.println();

        //10. Տպել մասիվում թվերի միջին թվաբանականը։

        double arithmetic = 0;

        arithmetic = (double) sumOfNumbers / numbers.length;

        System.out.println("Մասիվում թվերի միջին թվաբանականը: " + arithmetic);
    }

}
