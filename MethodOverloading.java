// everything in this page is important, uncomment everything and check

class class_overloading {
    int x, y, z;

    class_overloading() {
        x = 10;
        y = 20;
    }

    class_overloading(int a, int b) {
        x = a;
        y = b;
    }

    class_overloading(int a) {
        x = a;
        y = 100;
    }

    void display() {
        System.out.println("x: " + x + " y: " + y);
    }

    void add() {
        System.out.println(x + y);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    // int add(int a, int b) // method with different return types do not work in
    // java
    // {
    // return a+b;
    // }

    // double add(double a, double b) {
    //     return a + b;
    // }

    // void add(int a, double b) {
    //     System.out.println(a + b);
    // }

    // void add(double a, int b) {
    //     System.out.println(a + b);
    // }

    void add(float a, float b)
    {
        System.out.println(a+b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        // class_overloading obj = new class_overloading();
        // class_overloading obj2 = new class_overloading(1);
        // class_overloading obj3 = new class_overloading(1, 2);
        // obj.display();
        // obj2.display();
        // obj3.display();
        // obj.add();
        // obj.add(500, 500);
        // System.out.println(obj.add(12.32, 87.78));
        // obj.add(1000, 50.5050);
        // obj.add(500.5050, 1000);



    }
}