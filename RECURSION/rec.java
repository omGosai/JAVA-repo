package DS.RECURSION;

public class rec {

    public static void acending (int n){
        if (n==0){
            return;
        }
        acending(n-1);
        System.out.print(n+" ");
    }
    public static void dcending (int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        dcending(n-1);
    }

    public static boolean sorted_or_not(int arr[], int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index] > arr[index+1]){
            return false;
        }

        return sorted_or_not(arr,index+1);
    }

    // Find the x elm"s index  in the array
    public static int find_n (int arr[],int index,int n){
        if (index == arr.length-1){
            return -1;
        }
        if (arr[index] == n){
            return index;
        }
        return find_n(arr,index+1,n);
    }


    // How many time occurs given key return index
    public static void find_all(int arr[],int index,int k){
        if (index == arr.length-1){
            return;
        }
        if (arr[index] == k){
            System.out.println("Find ar the "+index);
        }
        find_all(arr,index+1,k);

    }

    public static void main(String[] args) {

        acending(10);

        System.out.println();
        dcending(10);

        //Sorted or not
        int numbers [] = {11,88,66,44,57,52};
        int index = 0;
        System.out.println();
        System.out.println("The Given array is sorted ? :"+sorted_or_not(numbers,index));


        //Find the x elm.
        int n = 44;
        System.out.println();
        int ans = find_n(numbers,index,n);
        if (ans == -1){
            System.out.println("NO such elm. found");
        }else {
            System.out.println("elm. found at index "+ans);
        }

        //Q-2
        int key = 44;
        find_all(numbers,index,key);

    }
}
