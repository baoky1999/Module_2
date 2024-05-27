package Thuchanh.ss15_Exception.Class_NumberFormatException;

import java.util.Scanner;

public class CalculationException {

    private void calculate(int x,  int y) {

        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập y: ");
        int y = Integer.parseInt(sc.nextLine());
        CalculationException calc =  new CalculationException();
        calc.calculate(x, y);
    }
}
