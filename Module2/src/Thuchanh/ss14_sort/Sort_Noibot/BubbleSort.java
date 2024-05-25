package Thuchanh.ss14_sort.Sort_Noibot;

public class BubbleSort {

    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void dubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        dubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
