package Thuchanh.ss21_Design_Pattern.FactoryMethod;

public class FactoryAnimal {

    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
