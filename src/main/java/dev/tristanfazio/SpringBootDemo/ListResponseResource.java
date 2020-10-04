package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class ListResponseResource {
    private final List<Integer> sortedList;


    public ListResponseResource(List<Integer> sortedList) {
        this.sortedList = sortedList;
    }

    public List<Integer> getSortedList() {
        return sortedList;
    }
}
