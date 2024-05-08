/*Complete the function that accepts a string parameter, and reverses each word in the string.
All spaces in the string should be retained.

Examples

        "This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps" */


public class h {
    public static String reverseWords(final String original)
    {
        int len = original.length();
        String rev = "";

        while (len > 0){
            rev = rev + original.charAt(len - 1);
            len--;
        }

        return rev;
    }
}
