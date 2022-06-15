package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        String prompt = "Please enter the radius of your circle:";
        Input input = new Input();
        double radius = input.getDouble(prompt);
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of the circle is %.2f%n", area);
        System.out.printf("The circumference of your circle is %.2f", circumference);
    }
}
