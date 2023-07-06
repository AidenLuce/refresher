package Shapes;

import Shapes.*;

public class shapesTest {
    static Rectangle box1 = new Rectangle(4,5);
    static Rectangle box2 = new Square(5);

    public static void main(String[] args) {
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

    }
}
