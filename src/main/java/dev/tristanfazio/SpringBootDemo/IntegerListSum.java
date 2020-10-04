package dev.tristanfazio.SpringBootDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerListSum {
    public IntegerListSum(){};

    public int sum(int[] integerArray) {
        List<Integer> integerList = Arrays.stream(integerArray)
                .boxed()
                .collect(Collectors.toList());

        return integerList.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }
}
