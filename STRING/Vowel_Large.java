package DS.STRING;

import java.util.Locale;

public class Vowel_Large {
    static int How_many_vowel(String str){
        int count = 0;
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c=='a' | c=='e' | c=='o' | c=='u'){
                count++;
            }
        }

        return count;
    }


    static String Large(String array []){
        // Largest String in lexico graphicaly
        // Guess
        String l = array[0];
        for (int i=1; i< array.length; i++){
            if (l.compareTo(array[i]) < 0){
                l = array[i];
            }
        }
        return l;
    }
    public static void main(String[] args) {

        String str =  "Hello world welcome to the world";
        String a ="";

        System.out.println("Vowel's in string :"+How_many_vowel(str));
        System.out.println("Vowel's in string :"+How_many_vowel(a));

        String array [] = {"A","B","C","D","Zues"};
        System.out.println(Large(array));
    }
}
