package Shapes;

public class Circle {
    double radius;
    String  colour;

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
