import Shapes.Circle;
import Shapes.Square;

public class AreaCircle {
    public static void main(String[] args) {
        Circle c1=new Circle(21,"red");
        Square s1=new Square(4,"blue");
        System.out.println(c1.getArea());
        System.out.println(s1.getArea());
    }
}
