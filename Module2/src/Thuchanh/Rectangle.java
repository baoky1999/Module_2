package Thuchanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); //nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); //nhập chiều cao

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
