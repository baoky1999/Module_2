package Baitap.AccessModifier;

class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getAgea() {
        return Math.PI * radius * radius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.);

        System.out.println(circle.getRadius());
        System.out.println(circle.getAgea());
    }
}

