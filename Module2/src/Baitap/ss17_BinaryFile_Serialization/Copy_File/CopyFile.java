package Baitap.ss17_BinaryFile_Serialization.Copy_File;

import java.io.*;

public class CopyFile implements Serializable {

    public static void main(String[] args) {

        File sourceFile = new File("D:\\Module_2\\Module2\\src\\Baitap\\ss17_BinaryFile_Serialization\\Copy_File\\code.dat");
        File tagetFile = new File("D:\\Module_2\\Module2\\src\\Baitap\\ss17_BinaryFile_Serialization\\Copy_File\\gym.dat");

        if (!sourceFile.exists()) {
            System.out.println("File không tồn tại");
            return;
        }

        if (tagetFile.exists()) {
            System.out.println("File đã tồn tại");
            return;
        }

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(tagetFile)) {
            byte[] buffer = new byte[1024];
            int readByte;
            int totalByte = 0;
            while ((readByte = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, readByte);
                totalByte += readByte;
            }
            System.out.println("Đã sao chép thành công");
            System.out.println("Số byte trong lệp là: " + totalByte);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
