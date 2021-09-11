// package classwork;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int ar1[] = new int[5];
        float[] ar2 = new float[5];


        int ar3[];
        ar3 = new int[5];

        int i;
        Scanner sc = new Scanner(System.in);

        for (i=0;i<5;i++) {
            // ar1[i]=sc.nextInt();
            System.out.print(ar1[i]);
        }

        System.out.print('\n');

        for (i=0;i<5;i++) {
            // ar1[i]=sc.nextInt();
            System.out.print(ar2[i]);
        }

        System.out.print('\n');

        for (i=0;i<5;i++) {
            // ar1[i]=sc.nextInt();
            System.out.print(ar3[i]);
        }

        System.out.print('\n');

        sc.close();

    }
}
