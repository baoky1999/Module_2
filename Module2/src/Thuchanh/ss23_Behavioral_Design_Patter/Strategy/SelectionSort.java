package Thuchanh.ss23_Behavioral_Design_Patter.Strategy;

import java.util.List;

public class SelectionSort implements SortStratery {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection Sort");
    }
}
