public class Rough {
    public static void main(String[] args) {
        PracticeChild obj = new PracticeChild();
        obj.get(1,"Siddharth",19);
        obj.display();
    }
}

class PracticeParent {
    String name;
    int age;
    void get(String n, int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}

class PracticeChild extends PracticeParent {
    int id;
    void get(int i, String n, int a)
    {
        id=i;
        super.get(n,a);
    }
    void display()
    {
        super.display();
        System.out.println("\nId: "+id);
    }
}