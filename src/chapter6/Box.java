package chapter6;

public class Box {

    double width;
    double height;
    double depth;

    Box(){

        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

//    Box(double w, double h, double d){
//
//        System.out.println("Koнcтpyиpoвaниe объекта Вох");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }

    void volume(){

        System.out.print("Oбъем равен ");
        System.out.println(width * height * depth);

    }

    double volumeR(){

        return width * height * depth;

    }

    void setDim(double w, double h, double d){

        width = w;
        depth = d;
        height = h;

    }

}
