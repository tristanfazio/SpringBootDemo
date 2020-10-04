package dev.tristanfazio.SpringBootDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class IntegerListControllerTests {
	IntegerListController integerListController = new IntegerListController();

	int[] unSortedList = {
			2, 4, 11, 1, 5, 13, 8, 15, 24, 19, 7, 17, 10, 14, 20, 16, 6, 25, 3, 18, 9, 22, 21, 23, 12
	};

	int[] sortedList = {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25
	};

	@Test
	void givenAnUnsortedList_whenSentToSortRoute_thenSortedListResponseReturned_AndSummationPresent() {
		IntegerListRequest unsortedListRequest = new IntegerListRequest(unSortedList);
		SortedListResponse response = integerListController.sort(unsortedListRequest);
		assertArrayEquals(sortedList,response.getSortedList());
		assertEquals(325,response.getListSummation());
	}

}
