package Baitap.ss19_String_Regex.ValidateSDT;

import java.util.Scanner;

public class ValidateSDTTest {

    private static ValidateSDT validateSDT;

    public static void main(String[] args) {
        validateSDT = new ValidateSDT();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập SDT cần kiểm tra:");
        String sdt = input.nextLine();
        boolean isValid = validateSDT.validate(sdt);
        if (isValid) {
            System.out.println("Số điện thoại: " + sdt + " hợp lệ");
        } else {
            System.out.println("Số điện thoại: " + sdt + " KHÔNG hợp lệ!");
        }
    }
}
