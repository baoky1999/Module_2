package Baitap.ss14_Sort.Sort_Chen_2;

public class InsertionSort1 {

    public static void Sort(int[] list) {
        int x;
        int pos;

        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
    public static void main(String[] args) {
        int[] list = { 4, 5, 6, 7, 8, 9 };
        Sort(list);
        System.out.println("List sau khi sắp xếp: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
