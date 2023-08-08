package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);

        System.out.println("Box 1 Area: " + box1.getArea()); // Should return 20
        System.out.println("Box 1 Perimeter: " + box1.getPerimeter()); // Should return 18

        Square box2 = new Square(5);

        System.out.println("Box 2 Area: " + box2.getArea()); // Should return 25
        System.out.println("Box 2 Perimeter: " + box2.getPerimeter()); // Should return 20
    }
}
