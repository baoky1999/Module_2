package Baitap.Inheritance.TriangleAndShare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập màu:");
        String color = sc.nextLine();
        System.out.print("Nhập side1:");
        double side1 = sc.nextDouble();
        System.out.print("Nhập side2:");
        double side2 = sc.nextDouble();
        System.out.print("Nhập side3:");
        double side3 = sc.nextDouble();

        Triangle triangle = new Triangle( color, side1, side2, side3);
        System.out.println(triangle.toString());
        System.out.println("Diện tích tam giác : " + triangle.getArea());
        System.out.println("Chu vi tam giác : " + triangle.getPerimeter());
    }
}
