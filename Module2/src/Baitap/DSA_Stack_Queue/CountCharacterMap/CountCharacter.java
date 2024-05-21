package Baitap.DSA_Stack_Queue.CountCharacterMap;

import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacter {

    public static void countCharacter(String[] words) {

        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        int count;
        for (String word: words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Số lượng các từ xuất hiện: ");
        int count1;
        for (String word: wordCountMap.keySet()) {
            count1 = wordCountMap.get(word);
            System.out.println(word + ": " + count1);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào đây: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        countCharacter(words);

    }
}
