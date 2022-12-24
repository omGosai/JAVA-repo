package DS.ARRAY;

public class Arrays {
    static void min_val (int arr[]){
        if(arr.length == 0){
            System.out.println("Array is empty");
        }
        int min = arr[0];
        for(int i=1; i< arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum value :"+min);
    }
    static void max_val (int arr[]){
        if(arr.length == 0){
            System.out.println("Array is empty");
        }

        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum value :"+max);
    }

    static void reverse(int arr[]){
        int sti =0, endi = arr.length-1;

        while (sti<endi){
            int t = arr[endi];
            arr[endi] = arr[sti];
            arr[sti] = t;
            sti++;endi--;
        }
        System.out.println("Array reverse :");
        print(arr);
    }
    static void print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={54,76,24,98,35,67};

        print(arr);
        System.out.println();
        max_val(arr);
        min_val(arr);
        reverse(arr);
    }
}
