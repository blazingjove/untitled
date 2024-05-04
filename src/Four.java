/*
The objective is to return all pairs of integers from a given array of integers that have a difference of 2.

The result array should be sorted in ascending order of values.

Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.
Examples

        [1, 2, 3, 4]  should return [[1, 3], [2, 4]]

        [4, 1, 2, 3]  should also return [[1, 3], [2, 4]]

        [1, 23, 3, 4, 7] should return [[1, 3]]

        [4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
*/


import java.util.Arrays;
import java.util.List;

public class Four {
    public static int[][] twosDifference(int[] array) {
        //declaring and assigning values to vars
        int length = array.length;

        //sorting array values from smallest to largest
        list sortedList = Arrays.asList(Arrays.sort(array));

        System.out.println(List.toString(sortedList));
    }
}
