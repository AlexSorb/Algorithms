import org.homework.algorithms.algorithms.sort.Sort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSort {

    @Test
    public void InsertionSortTest() {

        int[] notSortArray = {5, 4, 3, 7, 4, 8};
        int[] sortedArray = {3, 4, 4, 5, 7, 8};

        Sort.InsertionSort(notSortArray);
        Assertions.assertArrayEquals(notSortArray, sortedArray);
    }
}
