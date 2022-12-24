package DS.ARRAY;

public class Diagonalsum {
    // 0(n^2)
    static int diagonalsum (int arry[][]){
        int sum = 0;

        for (int i=0; i< arry.length; i++){
            for (int j=0; j<arry[0].length; j++){
                // Primary diagonal
                if (i==j){
                    sum += arry[i][j];
                }
                // secondry diagonal
                else if (i+j == arry.length-1){
                    sum += arry[i][j];
                }
            }
        }
        return sum;
    }


    //0(n)
    static int d_sum(int array [][]){
        int sum =0;
        for (int i=0; i<array.length; i++){
            // Primary Diagonal
            sum += array[i][i];
            // Secondry Diagonal
            if (i != array.length-1-i)  // For overlapping elm - if (i!=j)
               sum += array[i][array.length-1-i];

        }
        return sum;
    }
    public static void main(String[] args) {

        int array[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("SUM :"+diagonalsum(array));
        System.out.println("Sum :"+d_sum(array));

    }
}

/*

  Brut force :
  Primary diagonal -->  i==j
  Scondry diagonal --> i+j = n-1;

  Optimized :
  P.D. --> i==j , add[i][i]
  S.D. --> i+j = n-1;
           j = n-1-i;

*/
