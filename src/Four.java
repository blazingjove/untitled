/*Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.*/

public class Four {
    public static int findSmallestInt(int[] args) {
        int lowest = args[0];

        for (int i = 0; (i < args.length-1); i++) {
            if (lowest > args[i+1]){
                lowest = args[i+1];
                System.out.println(lowest);
            }

        }
        return lowest;
    }
}
