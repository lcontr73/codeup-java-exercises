package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5,3);
        double perimeter = myShape.getPerimeter();
        System.out.println(perimeter);

        Measurable myShape2 = new Square(5,3);
        double area = myShape2.getArea();
        System.out.println(area);



//        Rectangle box1 = new Rectangle();
//        //only need to set type once so don't have to do it again later for box2
//        double area = box1.getArea();
//        double perimeter = box1.getPerimeter();
//        System.out.println("The area is " + area + " and the perimeter is "  + perimeter + " of the rectangle.");
//
//        //This is an example of polymorphism
//        Rectangle box2 = new Square();
//        //I didn't need to have the below area and perimeter type defined since it's already defined
////        area = box2.getArea();
////        perimeter = box2.getPerimeter();
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
