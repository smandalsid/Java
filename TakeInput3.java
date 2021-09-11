// package classwork;
import java.util.Scanner;

public class TakeInput3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String temp = sc.nextLine();
        String line = sc.nextLine();

        System.out.println(word);
        System.out.println(line);

        sc.close();
    }
}
