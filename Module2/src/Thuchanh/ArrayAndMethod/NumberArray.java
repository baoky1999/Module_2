package Thuchanh.ArrayAndMethod;

import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: "); // tạo size của mảng
            size = scanner.nextInt();
            if ( size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }while ( size > 20);
        //nhập giá trị các phần tử trong mảng
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        // in ra danh sách tài sản đã nhập
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + ",at position " + index);

    }
}
