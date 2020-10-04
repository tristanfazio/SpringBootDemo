package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class SortedListResponse {
    List<Integer> sortedList;
    int listSummation;

    public SortedListResponse(List<Integer> sortedList, int listSummation) {
        this.sortedList = sortedList;
        this.listSummation = listSummation;
    }

    public List<Integer> getSortedList() {
        return sortedList;
    }

    public int getListSummation() {
        return listSummation;
    }
}
