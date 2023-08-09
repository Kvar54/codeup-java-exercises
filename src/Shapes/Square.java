package Shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 5;
    }

    @Override
    public double getArea() {
        return 5;
    }

    @Override
    public void setLength(double Length) {

    }

    @Override
    public void setWidth(double Width) {

    }
}
