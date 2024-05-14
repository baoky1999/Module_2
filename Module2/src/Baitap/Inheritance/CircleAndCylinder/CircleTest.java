package Baitap.Inheritance.CircleAndCylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "green");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.0, "blue", 2.0);
        System.out.println(cylinder);
    }
}
