package Shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    protected int length;
//    protected int width;
//
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//    public Rectangle() {
//    }
}
