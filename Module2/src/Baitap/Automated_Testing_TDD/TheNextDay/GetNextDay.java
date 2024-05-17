package Baitap.Automated_Testing_TDD.TheNextDay;

import java.time.LocalDate;

public class GetNextDay {

    public static String newDay(int day, int month, int year ) {

        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate nextDay = currentDate.plusDays(1);
        return nextDay.getDayOfMonth() + "/" + nextDay.getMonthValue() + "/" + nextDay.getYear();

    }
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDay = currentDate.plusDays(0);
        System.out.println(nextDay.getDayOfMonth());
        System.out.println(nextDay.getMonthValue());
        System.out.println(nextDay.getYear());
    }
}
