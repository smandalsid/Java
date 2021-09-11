public class Constructor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show();
        
        Student obj2 = new Student(12);
        obj2.show();
        
        Student obj3 = new Student(13,"Siddharth");
        obj3.show();
    }
}

class Student {
    int roll;
    String name;
    Student()
    {
        roll=100;
    }
    Student(int r)
    {
        roll=r;
        name="HEHE";
    }
    Student(int r, String n)
    {
        roll=r;
        name=n;
    }
    void show()
    {
        System.out.println(roll);
        System.out.println(name);
    }
}