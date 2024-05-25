package Thuchanh.ss14_sort.Sort_Noibot_2;

import java.util.Scanner;

public class BubbleSortByStep {

    public static void bubbleSort(int[] arr) {

        boolean swapped = true;
        for (int i = 1; i < arr.length && swapped; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (swapped == false) {
                System.out.println("Mảng đã được sắp xếp và không cần thay đổi vị trí của các phần tử");
                break;
            }

            System.out.println("Danh sách sau khi " + i + " sắp xếp:");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size của mảng: ");
        int[] arr = new int[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        bubbleSort(arr);
    }
}
