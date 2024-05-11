/*Write a function that takes in a string of one or more words, and returns the same string, but with all words that have
five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.

Examples:

        "Hey fellow warriors"  --> "Hey wollef sroirraw"
        "This is a test        --> "This is a test"
        "This is another test" --> "This is rehtona test"*/


import java.util.Arrays;


// after solving notes. becoming more familiar with methods and libraries

public class k {
        public static String spinWords(String sentence) {
            String[] words = sentence.split(" ");


            for (int i = 0; i < words.length; i++) {
                if(words[i].length() >= 5) {
                    StringBuilder rev = new StringBuilder();
                    int len = words[i].length();
                    while (len > 0){
                        rev.append(words[i].charAt(len - 1));
                        len--;
                    }
                    words[i] = rev.toString();
                } else {
                    System.out.println(words[i]);
                }
            }

            return String .join(" ", words);
        }
}

