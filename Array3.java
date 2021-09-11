// package classwork;

public class Array3 {
    public static void main(String[] args) {
        int ar1[] = new int[5];

        for (int x: ar1) // faster than normal method as it does not have the incrementation and condition checking
        {
            System.out.println(x); // its drawback is it cant go backwards, goes only forward
        }
    }
}
