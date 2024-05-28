package Thuchanh.ss16_IO_Test_File.FindMax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<Integer>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile (String filePath, int max) {
        try {
            FileWriter write = new FileWriter(filePath, true);
            BufferedWriter buffereWriter = new BufferedWriter(write);
            buffereWriter.write("Giá trị lớn nhất là: " + max);
            buffereWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
