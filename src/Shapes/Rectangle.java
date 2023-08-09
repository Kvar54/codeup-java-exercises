package Shapes;
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}

//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//        public double getArea(){
//        return this.length * this.width;
//
//        };
//
//public double getPerimeter(){
//        return (2 * this.length) * (2 * this.width);
//
//        };
//public static void main(String[] args) {
//    Rectangle r = new Rectangle(6, 60);
//    System.out.println("Area: " + r.getArea());
//    System.out.println("Perimeter: " + r.getPerimeter());
//}

//}

