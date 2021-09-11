// package classwork;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows do you want in first matrices: ");
        int a;
        a = sc.nextInt();
        
        int mat1[][] = new int[a][a];
        int mat2[][] = new int[a][a];
        int add1[][] = new int[a][a];

        int i,j;

        System.out.println("Enter values of matrix 1");
        
        for (i=0;i<a;i++)
        {
            for (j=0;j<a;j++)
            {
                mat1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter values of matrix 2");

        for (i=0;i<a;i++)
        {
            for (j=0;j<a;j++)
            {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                add1[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        System.out.println("Sum of first two arrays:");

        for (i=0;i<a;i++)
        {
            for (j=0;j<a;j++)
            {
                System.out.print(add1[i][j]+" ");
            }
            System.out.print("\n");
        }


        System.out.println("How many rows for second matrices:");
        a=sc.nextInt();

        int mat1_jagged[][] = new int[a][];
        int mat2_jagged[][] = new int[a][];
        int add2[][] = new int[a][];
        int b;

        for (i=0;i<a;i++)
        {
            System.out.println("How many columns in row "+(i+1)+":");
            b=sc.nextInt();
            mat1_jagged[i] = new int[b];
            mat2_jagged[i] = new int[b];
            add2[i] = new int[b];
        }

        System.out.println("Enter elements of first jagged matrix:");

        for (i=0;i<mat1_jagged.length;i++)
        {
            for(j=0;j<mat1_jagged[i].length;j++)
            {
                mat1_jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second jagged matrix:");

        for (i=0;i<mat2_jagged.length;i++)
        {
            for(j=0;j<mat2_jagged[i].length;j++)
            {
                mat2_jagged[i][j] = sc.nextInt();
            }
        }

        for (i=0;i<mat1_jagged.length;i++)
        {
            for (j=0;j<mat1_jagged[i].length;j++)
            {
                add2[i][j] = mat1_jagged[i][j]+mat2_jagged[i][j];
            }
        }


        System.out.println("Sum of second two arrays:");

        for (i=0;i<add2.length;i++)
        {
            for (j=0;j<add2[i].length;j++)
            {
                System.out.print(add2[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
