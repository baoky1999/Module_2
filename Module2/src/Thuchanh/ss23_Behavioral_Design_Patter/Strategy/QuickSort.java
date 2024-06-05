package Thuchanh.ss23_Behavioral_Design_Patter.Strategy;

import java.util.List;

public class QuickSort implements SortStratery{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}
