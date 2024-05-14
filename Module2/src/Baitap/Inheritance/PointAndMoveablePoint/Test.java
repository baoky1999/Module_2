package Baitap.Inheritance.PointAndMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point.setXY(2.5f, 3.8f);
        System.out.println(point);

        float[] array = point.getXY();
        System.out.println(array[0] + ", " + array[1]);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint.setXY(2.5f, 3.8f);
        movablePoint.setSpeed(29.9f, 5.5f);

        float[] array2 = movablePoint.getSpeed();
        System.out.println(movablePoint);
    }
}
