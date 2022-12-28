package DS.RECURSION;

public class TOH {
    public static void toh(int n,String src, String help, String des) {
        if (n == 1) {
            System.out.println(n+" Disk Moved from "+src+" to destination :"+des);
            return;
        }
        toh(n-1,src,des,help);
        System.out.println(n+" Disk Moved from "+src+" to destination :"+des);
        toh(n-1,help,src,des);

    }
    public static void main(String[] args) {
        int n = 3;
        toh(n,"S","H","D");


    }
}
