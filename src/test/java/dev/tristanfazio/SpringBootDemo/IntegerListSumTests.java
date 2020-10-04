package dev.tristanfazio.SpringBootDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IntegerListSumTests {

    List<Integer> list = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    );

    IntegerListSum integerListSum = new IntegerListSum();

    @Test
    void givenAListOfIntegers_whenPassedToSummer_thenSummationReturned() {
        assertEquals(55,integerListSum.sum(list));
    }
}
