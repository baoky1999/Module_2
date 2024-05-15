package Baitap.AbstractClass_Interface.Resizeable;

import Thuchanh.Abstraction.Th1.Square;

public class ResizeableSquare extends Square implements Resizeable {

    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }

    public ResizeableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void resize(double percent) {
        super.setSide(getSide() *percent);
    }

    public static void main(String[] args) {
        ResizeableSquare square = new ResizeableSquare();
        System.out.println(square.getAgea());
        System.out.println("affter");
        square.resize(5);
        System.out.println(square.getAgea());

    }
}
