package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Rectangle box1 = new Rectangle(4, 5);

        System.out.println("Box 1 Area: " + box1.getArea());
        System.out.println("Box 1 Perimeter: " + box1.getPerimeter());

        Square box2 = new Square(5);

        System.out.println("Box 2 Area: " + box2.getArea());
        System.out.println("Box 2 Perimeter: " + box2.getPerimeter());


//        Why does the code fail to compile if you leave
//         because when we implement measurable we need to include all abstract to methods inside the interface.
    }
}

