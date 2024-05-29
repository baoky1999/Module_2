package Baitap.ss16_IO_Test_File.Read_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    static String toString (Nation nation) {
        return nation.getId() + "," + nation.getCode() + "," + nation.getName();
    }

    public void readFile (String str) {
        List<Nation> nation = new ArrayList<Nation>();
        File fileInput = new File(str);

        try (FileReader read = new FileReader(fileInput))
        {
            BufferedReader buffer = new BufferedReader(read);
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] temp = line.split(",");
                nation.add(new Nation(Integer.parseInt(temp[0]), temp[1], temp[2]));
                System.out.println(temp[2]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thất file!");
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập File cần đoc: ");
        String str = input.nextLine();
        ReadFile readFile = new ReadFile();
        readFile.readFile(str);

    }

}
