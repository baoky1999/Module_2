package Baitap.ss13_ThuatToanSeach.SeachStringLienTiep;

import java.util.LinkedList;
import java.util.Scanner;

public class SeachStringMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String input = sc.nextLine();

        LinkedList <Character> max = new LinkedList<Character>();
        LinkedList <Character> list = new LinkedList <Character>();

        for (int i = 0; i < input.length(); i++) {
            if (list.size() > 1 && input.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(input.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character c : max) {
            System.out.print(c);
        }
    }
}
