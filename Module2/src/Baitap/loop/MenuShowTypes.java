package Baitap.loop;

import java.util.Scanner;

public class MenuShowTypes {

    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1, Print the rectangle");
            System.out.println("2, Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3, Print isosceles triangle");
            System.out.println("4, Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle: botton-left");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle: top-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle: botton-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 4; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Print the square triangle: top-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 5; k > i; k--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                    case 3:
                        System.out.println("Print isosceles triangle");
                        for (int i = 0; i < 6; i++) {
                            for (int j = 5; j > i; j--) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < i; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                default:
                    System.out.println("Exit");
            }
        }
    }
}
