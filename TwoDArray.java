// package classwork;

public class TwoDArray {
    public static void main(String[] args) {
        
        // 3 ways of initialising 2d arrrays
        
        int[][] ar1 = new int[2][2];
        int ar2[][] = new int[2][2];
        int [][]ar3 = new int[2][2];

        int ar4[][] = {{1,2},{3,4}};

        for (int i[]: ar4)
        {
            for (int j: i)
            {
                System.out.println(j);
            }
        }

    }
}
