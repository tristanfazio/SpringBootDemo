package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class SortedListResponse {
    int[] sortedList;
    int listSummation;

    public SortedListResponse(int[] sortedList, int listSummation) {
        this.sortedList = sortedList;
        this.listSummation = listSummation;
    }

    public int[] getSortedList() {
        return sortedList;
    }

    public int getListSummation() {
        return listSummation;
    }
}
