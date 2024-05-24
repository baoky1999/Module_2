package Baitap.ss13_ThuatToanSeach.SeachBinaryNhiPhan;

import java.util.Scanner;

public class SeachDeQuy {

    public static int[] arrange(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int banarySeach(int arr[], int left, int right, int value) {

        int mid = (left + right) / 2;

        if (right >= left) {
            if (arr[mid] == value) {
                return arr[mid];
            }
            if (arr[mid] > value) {
                return banarySeach(arr, left, mid - 1, value);
            }
            if (arr[mid] < value) {
                return banarySeach(arr, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        SeachDeQuy.arrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int result = arr.length -1;
        System.out.println("Nhập giá trị cần kiểm tra:");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println(SeachDeQuy.banarySeach(arr,0,result, value));
    }
}
