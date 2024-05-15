package Baitap.AbstractClass_Interface.Resizeable;

import Thuchanh.Abstraction.Th1.Rectangle;

public class ResizeableRactangle extends Rectangle implements Resizeable {

    public ResizeableRactangle() {
    }

    public ResizeableRactangle(double width, double length) {
        super(width, length);
    }

    public ResizeableRactangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() * percent);
        setLength(getLength() * percent);
    }

    public static void main(String[] args) {
        ResizeableRactangle rectangle = new ResizeableRactangle();
        System.out.println(rectangle.getAgea());
        System.out.println("affter");
        rectangle.resize(2);
        System.out.println(rectangle.getAgea());
    }
}
