// package classwork;

public class Array2 {
    public static void main(String[] args) {
        int ar1[] = new int[5];

        System.out.println(ar1.length);

        int ar2[] = ar1.clone();

        for (int i=0;i<5;i++)
        {
            System.out.println(ar2[i]);
        }

        System.out.println(ar2[-1]); // java cant print indexes out of range, cannot print negative or out of range indexes

    }
}
