package Baitap.ss16_IO_Test_File.Coppy_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        File sourceFile = new File("D:\\Module_2\\Module2\\src\\Baitap\\ss16_IO_Test_File\\Coppy_File\\codegym.txt");
        File targetFile = new File("D:\\Module_2\\Module2\\src\\Baitap\\ss16_IO_Test_File\\Coppy_File\\C03.txt");

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại!!!");
            return;
        }
        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại!!!");
            return;
        }

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(targetFile)){

            int character;
            int count = 0;

            while((character = reader.read()) != -1) {
                writer.write(character);
                count++;
            }

            System.out.println("File đã được sao chép xong");
            System.out.println("Số ký tự trong tệp là: " + count);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình đọc ghi!!!");
            e.getMessage();
        }




    }

}
