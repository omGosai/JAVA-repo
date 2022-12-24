package DS.STRING;

public class Palindrome {
    static Boolean palindrome (String str){

        //base case
        if (str == null){
            return false;
        }

        for (int i=0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String a = "abcdcba";

        String test = "Hello Wold";

        System.out.println("String a :"+palindrome(a));
        System.out.println("String test :"+palindrome(test));

    }
}
