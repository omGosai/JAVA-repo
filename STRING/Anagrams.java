package DS.STRING;

import java.util.Arrays;
import java.util.Locale;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 = "Heart";

        if (str1.length() == str2.length()){

            // Converting into lowercase
           str1 =  str1.toLowerCase();
           str2 =  str2.toLowerCase();

            // into Char array
            char a [] = str1.toCharArray();
            char b [] = str2.toCharArray();

            // sort array
            Arrays.sort(a);
            Arrays.sort(b);

            Boolean ans = Arrays.equals(a,b);

            if (ans) {
                System.out.println("String is anagams");
            }
            else {
                System.out.println("String is not anagams");
            }

        }
        else {
            // In case length is not same
            System.out.println("String is not anagams");
        }
    }
}
