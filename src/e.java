/*Complete the solution so that it returns true if the first argument(string)
passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
*/


public class e {
    public static boolean solution(String str, String ending) {
        int strLength = str.length();
        int endingLength = ending.length();
        int stringDiff = strLength - endingLength;

        if (strLength < endingLength) {
            return false;
        }

        return str.substring(stringDiff).equals(ending);

    }

}
