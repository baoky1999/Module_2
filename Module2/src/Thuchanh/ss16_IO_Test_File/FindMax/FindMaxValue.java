package Thuchanh.ss16_IO_Test_File.FindMax;

import java.util.List;

public class FindMaxValue {

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile rwf = new ReadAndWriteFile();
        List<Integer> numbers = rwf.readFile("D:\\Module_2\\Module2\\src\\Thuchanh\\ss16_IO_Test_File\\FindMax\\numbers.txt");
        int maxValue = findMax(numbers);
        rwf.writeFile("D:\\Module_2\\Module2\\src\\Thuchanh\\ss16_IO_Test_File\\FindMax\\result.txt", maxValue);
    }
}
