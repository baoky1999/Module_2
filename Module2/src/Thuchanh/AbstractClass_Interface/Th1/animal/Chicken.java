package Thuchanh.AbstractClass_Interface.Th1.animal;

import Thuchanh.AbstractClass_Interface.Th1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
