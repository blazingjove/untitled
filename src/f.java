/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely composed of odd integers or entirely composed of even integers except for a single integer
N. Write a method that takes the array as an argument and returns this "outlier" N.

        Examples

[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)

*/

// TODO after solving notes: need to be more cognizant of variables. look for more ways to simplify problem could have
//  simplified the problem by only looking at first three values to determine if i was looking for odd or even value.

public class f {
    static int find(int[] integers) {
        int oddCount = 0;
        int evenCount = 0;
        int oddLocation = 0;
        int evenLocation = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
                evenLocation = i;
            } else {
                oddCount++;
                oddLocation = i;
            }
        }
        if (oddCount == 1) {
            return integers[oddLocation];
        } return integers[evenLocation];
    }
}
