package Thuchanh.ss23_Behavioral_Design_Patter.Template;

public class Main {
    public static void main(String[] args) {
        Meal meal1 = new HambergerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
