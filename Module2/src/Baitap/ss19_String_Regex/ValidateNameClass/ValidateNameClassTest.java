package Baitap.ss19_String_Regex.ValidateNameClass;

import java.util.Scanner;

public class ValidateNameClassTest {

    private static ValidateNameClass validateNameClass;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần Test: ");
        String name = sc.nextLine();
        validateNameClass = new ValidateNameClass();
        boolean isValid = validateNameClass.validate(name);
        if (isValid) {
            System.out.println("Tên lớp: " + name + " hợp lệ");
        } else {
            System.out.println("Tên lớp: " + name + " KHÔNG hợp lệ!");
        }

    }
}
