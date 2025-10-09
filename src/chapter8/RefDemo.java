package chapter8;

import chapter7.Box;

public class RefDemo {

    static void main() {

        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();

        double vol;

        vol = boxWeight.volume();

        System.out.println("Oбъeм weightbox равен • + vol " + vol);
                System.out.println("Bec weightbox равен " + boxWeight.weight);

        plainBox = boxWeight;

        vol = plainBox.volume();

        System.out.println("Oбъeм plainbox равен " + vol);

    }

}
