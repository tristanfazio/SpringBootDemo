package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class IntegerListRequest {

    private final int[] list;

    public IntegerListRequest() {

        list = new int[0];
    }
    public IntegerListRequest(int[] list) {
        this.list = list;
    }

    public int[] getList() {
        return list;
    }
}
