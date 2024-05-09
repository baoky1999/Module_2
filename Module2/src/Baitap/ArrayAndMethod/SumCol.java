package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {

        int row;
        int col;
        int[][] array;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập size row của mảng: ");
        row = input.nextInt();
        System.out.print("Nhập size col của mảng: ");
        col = input.nextInt();
        array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int  j = 0; j < col; j++) {
                System.out.print("Nhập phần tử của mảng: ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.print("Nhập số cột col cần tính tổng: ");
        int M = input.nextInt();
        int sum = 0;
        for (int k = 0; k < col; k++) {
            System.out.print(array[k][M - 1] + "\t");
            sum += array[k][M - 1];
        }
        System.out.print("Tổng của các phần tử thuộc cột " + M + " là " + sum);
    }
}
