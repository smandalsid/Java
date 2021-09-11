// package classwork;
import java.util.Scanner; // put .*  at the end if you want to use all the classes in util

// taking input using scanner class

public class TakeInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        boolean c;
        b=sc.nextLine(); // read string as input
        a=sc.nextInt(); // read int as input
        c=sc.nextBoolean(); // read int as input
        sc.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
