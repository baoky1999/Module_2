package Baitap.OOP;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = input.nextDouble();
        System.out.print("Nhập b: ");
        double b = input.nextDouble();
        System.out.print("Nhập c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("Hiển thị: R1 = " + quadraticEquation.getRoot1());
            System.out.println();
            System.out.print("Hiển thị: R2 = " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("Nghiệm của chương trình là: " + quadraticEquation.getRoot1());
        }else if (quadraticEquation.getDiscriminant() < 0){
            System.out.print("The equation has no roots");
        }
    }

    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = 2 * getB() -  4 * getA() * getC();
        return delta;
    }

    public double getRoot1() {
            double r1 = (-getB() + Math.sqrt((getB() * getB()) - 4 * getA() * getC())) / 2 * getA();
            return r1;
    }


    public double getRoot2() {
            double r2 = (-getB() - Math.sqrt((getB() * getB()) - 4 * getA() * getC())) / 2 * getA();
            return r2;
    }
}
