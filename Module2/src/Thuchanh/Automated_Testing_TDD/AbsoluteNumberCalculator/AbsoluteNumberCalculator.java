package Thuchanh.Automated_Testing_TDD.AbsoluteNumberCalculator;


public class AbsoluteNumberCalculator {
    public static int findAbsolute (int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }
}
