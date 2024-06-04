package Thuchanh.ss21_Design_Pattern.ObjectPoll;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
