package Thuchanh.ss21_Design_Pattern.FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal animal = new FactoryAnimal();

        Animal a1 = animal.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animal.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
