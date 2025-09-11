package homework.homework1;

public class FigurePainter {

    public static void main(String[] args) {

        //*
        //* *
        //* * *
        //* * * *
        //* * * * *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //    *
        //   **
        //  ***
        // ****
        //*****

        int f = 5;

        for (int i = 0; i <= f; i++) {
            for (int s = 0; s < f - i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //* * * * *
        //  * * * *
        //    * * *
        //      * *
        //        *


        int z = 5;

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < z - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *

        int x = 5;

        for (int i = 1; i <= x; i++) {

            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = x - 1; i >= 1; i--) {

            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}