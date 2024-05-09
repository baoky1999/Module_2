package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 9, 25, 44, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Input a X: ");
        int x = input.nextInt();
        int index_del = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                array[i] = 0;
                index_del = i;
                break;
            }
        }
        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
