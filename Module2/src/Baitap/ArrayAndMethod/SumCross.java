package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class SumCross {

    public static void main(String[] args) {

        int col;
        int row;
        double[][] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số col: ");
            col = input.nextInt();
            System.out.print("Nhập số row: ");
            row = input.nextInt();
            if (col != row) {
                System.out.println("Số cột và số hàng phải bằng nhau, xin nhập lại");
            }
        }while (col != row);

        array = new double[row][col];
        double sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập các phần tử của mảng: ");
                array[i][j] = input.nextDouble();
                if (i == j) {
                    sum += array[i][j];

                }
            }
        }
        System.out.print("Tổng của các phần tử ở đừng chéo trung tâm là: " + sum);
    }
}
