package Baitap.Automated_Testing_TDD.FizzBuzzTranslate;

public class FizzBuzzTranslate {
    public static String checkFizzBuzz(int number) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            }else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                return "Fizz";
            }else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
                return "Buzz";
            }else {
                return numberToWords(number);
            }
    }
    public static String numberToWords(int number) {
        String[] ones ={"mươi", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"
                , "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};

        if (number < 20) {
            return ones[number];
        }else if (number < 100){
            int fist = number / 10;
            int last = number % 10;
            return ones[fist] + " " + ones[last];
        }
        return ones[number];
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzzTranslate.checkFizzBuzz(56));
    }
}
