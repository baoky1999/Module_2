package Baitap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc:");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }
        if (number < 10) {
            System.out.print(readNumberSmall(number));
        } else if (number < 20) {
            readNumberNormal(number);
        } else if (number < 100) {
            readNumberBig(number);
        } else {
            readNumberThree(number);
        }
    }

    private static String readNumberSmall(int number) {
        String small = "";
        switch (number) {
            case 0:
                small = "zero";
                break;
            case 1:
                small = "one";
                break;
            case 2:
                small = "two";
                break;
            case 3:
                small = "three";
                break;
            case 4:
                small = "four";
                break;
            case 5:
                small = "five";
                break;
            case 6:
                small = "six";
                break;
            case 7:
                small = "seven";
                break;
            case 8:
                small = "eight";
                break;
            case 9:
                small = "nine";
                break;
        }
    return small;
    }

    private static void readNumberNormal(int number) {
        switch (number) {
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eighteen");
                break;
            case 19:
                System.out.println("nineteen");
                break;
        }
    }

    private static void readNumberBig(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tensString = "";

        switch (tens) {
            case 2:
                tensString = "twenty";
                break;
            case 3:
                tensString = "thirty";
                break;
            case 4:
                tensString = "fourty";
                break;
            case 5:
                tensString = "fifty";
                break;
            case 6:
                tensString = "sixty";
                break;
            case 7:
                tensString = "seventy";
                break;
            case 8:
                tensString = "eighty";
                break;
            case 9:
                tensString = "ninety";
                break;

        }
        if (ones == 0) {
            System.out.println (tensString);
        }else {
            System.out.println (tensString + " " + readNumberSmall(ones));
        }

    }

    private static void readNumberThree(int number) {
        int hundreds = number / 100;
        int remainder = number % 100;
        System.out.print(readNumberSmall(hundreds) + " hundreds" + readNumberSmall(remainder));
        if (remainder != 0) {
            System.out.print(" and ");
            if (remainder < 10) {
                readNumberSmall(remainder);
            } else if (remainder < 20) {
                readNumberNormal(remainder);
            } else {
                readNumberBig(remainder);
            }
        }
    }
}
