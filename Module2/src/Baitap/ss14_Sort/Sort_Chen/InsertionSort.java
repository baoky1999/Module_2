package Baitap.ss14_Sort.Sort_Chen;

public class InsertionSort {


    public static void insertionSort(int[] arr) {

        int x;
        int pos;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("Sắp xếp lần thứ " + i + ":");
            for (int k =0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 4, 7, 9, 8, 3, 4, 2,6, 3};
        insertionSort(arr);
        System.out.println("Mảng sau khi được sắp xếp là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
