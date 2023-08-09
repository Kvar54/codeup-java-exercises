package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

//     getters
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;

//    setters
    }
    public abstract void setLength(double Length);
    public abstract void setWidth(double width);
}
