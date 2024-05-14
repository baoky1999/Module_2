package Baitap.Inheritance.Point2DAndPoint3D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        System.out.println(point);

        Point2D point2D = new Point2D(2.5f, 3.8f);
        System.out.println(point2D);

        point2D.setXY(-1.0f, 2.8f);
        System.out.println(point2D);

        float[] array = point2D.getXY();
        System.out.println(array[0] + ", " + array[1]);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(2.5f, 5.2f, 5.5f);
        System.out.println(point3D1);

        point3D1.setXYZ(2.5f, 3.2f, 4.6f);
        System.out.println(point3D1);

        float[] array2 = point3D1.getXYZ();
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
    }
}
