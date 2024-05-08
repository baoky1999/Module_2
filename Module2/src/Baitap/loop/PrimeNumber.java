package Baitap.loop;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int num = 2;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number: " + num);
                count++;
            }
            num++;
        }
    }
}
