package homework.homework1;

public class Homework1 {

    public static void main(String[] args) {

        /*Ունեք երկու ամբողջ թիվ x և y։
        Գրել ծրագիր, որը if-ով կպարզի և կտպի՝ որը մեծ է։
        Օգտագործել for ցիկլ՝ տպելու համար առաջին 5 բնական թվերը (1, 2, 3, 4, 5)։
        */

        int x, y;
        x = 1;
        y = 5;

        for (int i = x; i <= y; i++) {

            if (i > x) x = i;

        }

        System.out.println("Ամենամեծ թիվը " + x + "-ն է");

        // Հայտարարեք երկու ամբողջ փոփոխական (int a = 5; int b = 7;) և տպեք դրանց գումարը։
        int a, b;

        a = 5;
        b = 7;

        System.out.println("\na և b թվերի գումարը հավասար է " + (a + b) + "-ի" + "\n");

        //Տրված է int n = 3;։ Օգտագործելով for ցիկլ, տպեք n-ի բազմապատկման աղյուսակը 1-ից մինչև 10։

        int n = 3;

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " * " + i + " = " + (n * i));

        }
    }

}
