package Thuchanh.ss23_Behavioral_Design_Patter.Strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

    private SortStratery strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStratery strategy) {
        this.strategy = strategy;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        strategy.sort(items);
    }
}
