// package classwork;

public class JaggedArray {
    public static void main(String[] args) {

        // jagged array declaration, fixed size of rows, variable column

        int jagged_arr[][] = new int[][] {
            new int[] {1,2,3},
            new int[] {4,5},
            new int[] {6,7,8,9},
        }; 

        for (int i[]: jagged_arr)
        {
            for (int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

        int jagged_arr2[][] = new int[3][];

        jagged_arr2[0] = new int[3]; // row with 3 columns
        jagged_arr2[1] = new int[2]; // row with 2 columns
        jagged_arr2[2] = new int[4]; // row with 4 columns

        jagged_arr2[0][2]=1;
        jagged_arr2[1][1]=1;
        jagged_arr2[2][3]=1;

        for (int i[]: jagged_arr2)
        {
            for (int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

    }
}
