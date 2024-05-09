package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class PushArray {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên cần chèn: "); // Nhập số cần chèn
        int num = input.nextInt();

        System.out.println("Nhập vị trí index cần chèn: "); // Nhập vị trí để chèn vào
        int index = input.nextInt();

        if (index < 0 || index > array.length - 1) {
            System.out.println("Không thể chèn vào mảng array!");
        }else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = num;

            System.out.println("Mảng sau khi chèn phần tử num là :" );
            for (int i = 0;i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
