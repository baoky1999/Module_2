package Thuchanh.ArrayAndMethod;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a size: "); // nhập kích thước mảng
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": "); // nhập các phần tử trong mảng
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "element in array: ", ""); // im ra mảng đã nhập
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // in ra mảng đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j <array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
