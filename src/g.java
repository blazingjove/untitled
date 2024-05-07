/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing second character of the final
pair with an underscore ('_').

Examples:

        * 'abc' =>  ['ab', 'c_']
        * 'abcdef' => ['ab', 'cd', 'ef']

*/


import java.util.Arrays;

public class g {

    public static int solution(String s) {
        // finding the number of pairs in string s and rounding up.
        int counter =  (int) Math.ceil((double) s.length() / 2);
        int stringLenght = s.length();
        //generate a empty array with n indexes, n being the number of character pairs in string s + 1.
        int j =0;
        String[] splitString = new String[counter];

        for (int i = 0; i < counter; i++) {
                splitString[i]= String.valueOf(s.charAt(j)).concat(String.valueOf(s.charAt(j+1)));
                System.out.println(j);
                j = j+2;
        }

        System.out.println(Arrays.toString(splitString));

        //running loop to add two characters to each index in the array, splitString and then adding "_" if required



        return splitString.length;
    }
}
