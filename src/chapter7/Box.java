package chapter7;

public class Box {

    public double width;
    public double height;
    public double depth;


    public Box(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;

    }

    public Box() {

        width = -1;
        height = -1;
        depth = -1;

    }

    public Box(Box ob){

        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    public Box(double len) {

        width = height = depth = len;

    }

    public double volume() {

        return width * height * depth;

    }


}
