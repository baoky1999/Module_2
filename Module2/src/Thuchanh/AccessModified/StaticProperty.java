package Thuchanh.AccessModified;

public class StaticProperty {

    private String name;

    public static int numberOfCars;
    public StaticProperty(String name, String engine) {
        this.name = name;
        numberOfCars++;
    }

    //getter and setter
    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("Mazda 3", "Skyactiv 3");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty car2 = new StaticProperty("Mazda 6", "Skyactiv 6");
        System.out.println(StaticProperty.numberOfCars);
    }
}
