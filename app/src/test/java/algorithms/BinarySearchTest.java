package algorithms;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void rank_ShouldFindCorrectValue_WhenKeyValueIsPresent() {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        int searchedValue = 4;

        int result = BinarySearch.rank(sortedArray, searchedValue);

        int expectedIndex = 3;
        assertEquals(expectedIndex, result);
    }

    @Test
    void rank_ShouldFindCorrectValue_WhenKeyValueIsPresentInArrayWithNegativeValues() {
        int[] sortedArray = {-10,-4,-2,0,1,2,3,4,5,6,7,8,9,10};
        int searchedValue = -4;

        int result = BinarySearch.rank(sortedArray, searchedValue);

        int expectedIndex = 1;
        assertEquals(expectedIndex, result);
    }

    @Test
    void rank_ShouldNotFindValue_WhenValueHigherThanHighestValueInArray() {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        int searchedValue = 123;

        int result = BinarySearch.rank(sortedArray, searchedValue);

        assertEquals(-1, result);
    }

    @Test
    void rank_ShouldNotFindValue_WhenValueSmallerThanHighestValueInArray() {
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        int searchedValue = -23;

        int result = BinarySearch.rank(sortedArray, searchedValue);

        assertEquals(-1, result);
    }
}