package dev.tristanfazio.SpringBootDemo;

import java.util.List;

public class IntegerListSum {
    public IntegerListSum(){};

    public int sum(List<Integer> integerList) {
        return integerList.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }
}
