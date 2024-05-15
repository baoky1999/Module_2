package Baitap.AbstractClass_Interface.Resizeable;

import Thuchanh.Abstraction.Th1.Circle;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle (double radius,String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public void resize(double percent) {
        setRadius(getRadius() + percent);
    }

    public static void main(String[] args) {
        ResizeableCircle resizeableCircle = new ResizeableCircle();
        System.out.println(resizeableCircle.toString());
        System.out.println("affter");
        resizeableCircle.resize(2);
        System.out.println(resizeableCircle.toString());

    }
}
