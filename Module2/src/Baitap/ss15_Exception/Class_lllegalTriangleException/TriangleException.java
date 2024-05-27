package Baitap.ss15_Exception.Class_lllegalTriangleException;

import java.util.Scanner;

public class TriangleException  {


    private void triangle(int a, int b, int c) throws IllegalTriangleException, Exception {

            if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) {
                System.out.println("Là tam giác");
            } else {
                throw new IllegalTriangleException("Không phải là tam giác");
            }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh c: ");
        int c = Integer.parseInt(sc.nextLine());
        try {
            TriangleException traig = new TriangleException();
            traig.triangle(a, b, c);
        } catch (IllegalTriangleException anc) {
            System.out.println(anc.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
