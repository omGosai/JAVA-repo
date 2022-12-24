package DS.ARRAY;

public class Array_Pairs {
    public static void main(String[] args) {
        int array [] = {2,4,6,8,10,12};

        int p=0;
        for (int i =0; i<array.length; i++){
            int cur = array[i];   // 2,4,6,8,10,12;
            for (int j=i+1; j< array.length; j++){
                System.out.print(cur+"<->"+array[j]+",");
                p++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :"+p);  // Total pairs : n(n-1)/2
    }
}
