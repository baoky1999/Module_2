package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class MaxTwoArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kich thước cột của mảng: ");
        int N = input.nextInt();
        int M = input.nextInt();
        int[][] matrix = new int[N][M];

        System.out.println("Enter " + matrix.length + " row and " + matrix[0].length + " columns: " );
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        float max = matrix[0][0];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
