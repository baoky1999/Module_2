package Baitap.ss13_ThuatToanSeach.findStringLengthMax;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm: ");
        String input = sc.nextLine();

        LinkedList<Character> max = new LinkedList<Character>();

        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.addAll(list);
                break;
            }
        }
        for ( Character c : max) {
            System.out.println(c);
        }
    }
}
