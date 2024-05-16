/*
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
*/


public class m {

    public static String incrementString(String str) {
        String number = "";
        String strholder = "";
        for (int i = 0; i < str.length(); i++) {
            try {
                if (Integer.parseInt(String.valueOf(str.charAt(i))) % 1 == 0) {
                    number = number.concat(String.valueOf(str.charAt(i)));
                }
            } catch (Exception e) {
                strholder = strholder.concat(String.valueOf(str.charAt(i)));
            }
            System.out.println("index "+ i +" "+"value: " +str.charAt(i));
        }
        number = String.valueOf(Integer.parseInt(number)+1);
        strholder = strholder.concat(number);
        return strholder;

    }
}
