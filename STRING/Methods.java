package DS.STRING;

public class Methods {
    public static void main(String[] args) {
        String a="Hello java";


        // Two way for create String
        System.out.println();
        String name = "Om gosai";
        String name2 = new String("Om gosai");

        System.out.println(name);
        System.out.println(name2);


        String str = "Hello";

        // length
        System.out.println(str.length());

        // toUpperCase() and toLowerCase();
        System.out.println(str.toUpperCase());

        // indexof
        System.out.println(str.indexOf("H"));

        //charAt
        System.out.println(str.charAt(0));

        //substring
        System.out.println(str.substring(1,4));



        //contains
        System.out.println(str.contains("h"));

        System.out.println(str.isEmpty());

        System.out.println(str.equals("Hello"));

        //compareTo
        String str1="JAVA", str2="JAVA";
        int ans = str1.compareTo(str2);
        System.out.println("compareTo method :"+ans);
        /*
         * 1. str1 > str2 => Positive value
         * 2. str1 == str2 => 0
         * 3. str1 < str2 => Nagitive value  */


        // into char array
        char C_Array []= str.toCharArray();


        //split
        System.out.println();
        System.out.println("Split String :");
        String me [] = "I like java language".split(" ");
        System.out.println(me);
        for  (int i=0; i<me.length; i++){
            System.out.println(me[i]);
        }
    }
}
