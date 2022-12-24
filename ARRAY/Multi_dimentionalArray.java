package DS.ARRAY;

import java.util.Scanner;

public class Multi_dimentionalArray {
    public static void dynamicarray(){

        //dynamic user define array
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter the row for 2D Array :");
        int row = ac.nextInt();
        System.out.print("Enter the column for 2D Array :");
        int col = ac.nextInt();
        int data [] [] = new int[row][col];
        System.out.println("Array intialize...");

        // adding data in array
        int r=0;
        for (int i=0; i< row; i++){
            int c=0;
            for (int j=0; j< col; j++){
                System.out.print("Enter for ("+r+""+c+") :");
                data [i][j] = ac.nextInt();
                c++;
            }
            r++;
        }

        //printing  array
        System.out.println("Your DATA");
        for (int i=0; i<data.length; i++){
            for (int j=0; j<data.length; j++){
                System.out.print(" "+data[i][j]);
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int data [] [] = new int[3][3];
        data[0][0] = 49;
        data[0][1] = 50;
        data[0][2] = 51;
        data[1][0] = 69;
        data[1][1] = 70;
        data[1][2] = 71;

        for (int i=0; i< data.length; i++){
            for (int j=0; j<data.length; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        dynamicarray();
    }
}
