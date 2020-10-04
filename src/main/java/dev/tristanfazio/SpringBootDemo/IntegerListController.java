package dev.tristanfazio.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IntegerListController {

    IntegerListSorter integerListSorter = new IntegerListSorter();
    IntegerListSum integerListSum = new IntegerListSum();

    @GetMapping("/")
    public String defaultRoute() {
        return "Hello World, Spring Boot Demo Running";
    }
    @PostMapping("/sort")
    public SortedListResponse sort(@RequestBody IntegerListRequest integerList) {
        int[] sortedIntegerList = integerListSorter.sortIntegerList(integerList.getList());
        int summation = integerListSum.sum(sortedIntegerList);
        return new SortedListResponse(sortedIntegerList,summation);
    }
}
