package Baitap.ArrayAndMethod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String myString;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi của bạn vào đây:");
        myString = input.nextLine();

        System.out.print("Nhập ký tự muốn kiểm tra số lần xuất hiện trong chuỗi:");
        char character = input.next().charAt(0);
        int count = 0;

        int length = myString.length();
        for (int i = 0; i < length; i++) {
            System.out.print(myString.charAt(i) + "\t");
            if (character == myString.charAt(i)) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Số lần ký tự xuất hiện trong chuỗi là: " + count);

    }
}
