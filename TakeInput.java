// package classwork;

// take inputs using command line arguments

public class TakeInput {
    public static void main(String[] args) {
        System.out.println("Program to take input");
        System.out.println("Program to take first input "+args[0]); // take input from the user
        System.out.println("Program to take second input "+args[1]);
        System.out.println("Program to take third input "+args[2]);


        int a,b,c;
        a=Integer.parseInt(args[0]); // to convert the string number to integer
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        
        System.out.println("First input: "+(a+5));
        System.out.println("Second input: "+(b+10));
        System.out.println("Third input: "+(c+15));

        // if we put strings instead of numbers to convert to integer it will give error, even if we give some inputs correct others wrong, it wont work

    }
    
}
