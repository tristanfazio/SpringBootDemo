package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class IntegerListResource {
    private final List<Integer> list;


    public IntegerListResource(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }
}
