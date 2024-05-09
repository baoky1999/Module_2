package Thuchanh.ArrayAndMethod;

import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập tổng số học sinh: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Tổng số học sinh không được vượt quá 30");
            }
        }while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập số điểm của học sinh " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.print("Danh sách điểm của học sinh: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] > 5 && array[j] < 10) {
                count++;
            }
        }
        System.out.println("\n"+"Số học sinh đỗ đại học là: " + count);
    }
}
