package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class IntegerListRequest {
    private final List<Integer> list;

    public IntegerListRequest(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }
}
