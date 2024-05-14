package Thuchanh.AbstractClass_Interface.Th1;

import Thuchanh.AbstractClass_Interface.Th1.animal.Animal;
import Thuchanh.AbstractClass_Interface.Th1.animal.Chicken;
import Thuchanh.AbstractClass_Interface.Th1.animal.Tiger;
import Thuchanh.AbstractClass_Interface.Th1.edible.Edible;
import Thuchanh.AbstractClass_Interface.Th1.fruit.Apple;
import Thuchanh.AbstractClass_Interface.Th1.fruit.Fruit;
import Thuchanh.AbstractClass_Interface.Th1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
