package DS.STRING;

public class Sub_string {
    static String SubString (String s,int start,int end){
        String substring = "";

        for (int i=start; i<end; i++){
            substring += s.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {


        String h = "Hello World";

        int start = h.indexOf('W');
        int end = h.length();

        System.out.println(SubString(h,start,end));


    }
}
