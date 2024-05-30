package Thuchanh.ss18_Threading.Racing_Cars;

public class Main {

    public static int DISTANCE = 100;
    public static int STEP = 5;

    public static void main(String[] args) {

        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);

        System.out.println("Distance: 100Km");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
