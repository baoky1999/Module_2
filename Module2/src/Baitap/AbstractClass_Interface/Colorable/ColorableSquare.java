package Baitap.AbstractClass_Interface.Colorable;

import Thuchanh.Abstraction.Th1.Square;

public class ColorableSquare extends Square implements Colorable{
    @Override
    public void howToColor() {
        System.out.println("Color all four sides...");

    }

    public ColorableSquare() {
    }

    public ColorableSquare(double side) {
        super(side);
    }

    public ColorableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    public static void main(String[] args) {
        ColorableSquare cs = new ColorableSquare();
        cs.setSide(5);
        System.out.println("Agea = " + cs.getAgea());
        if (cs instanceof ColorableSquare) {
            ((Colorable) cs).howToColor();
        }
    }

}
