package Shapes;

public class Square extends Rectangle {
    public int side;

    public double getArea() {
        return side*side;
        // This will also square it
        // Math.pow(side, 2);
    }

    public double getPerimeter(){
        return 4 * side;
    }

    public Square(int side) {
        //This calls the parents constructor
        super(side, side);
        // This ensures that Square has a side property
        this.side = side;
    }
}
