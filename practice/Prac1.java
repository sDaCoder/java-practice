package practice;

class Parent{
    int age;
    
    Parent(int age) { this.age = age; }
    void show(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    private int roll;
    
    Child(int age, int roll) {
        super(age);
        this.roll = roll;
    }

    void show(){
        System.out.println("Child class, having age: " + this.age + " and roll: " + this.roll);
    }
}

class B{
    private int x;
    B(int x) { this.x = x; }
    B(B b) { this(b.x); }
    void show(){
        System.out.println(this.x);
    }
}

interface Inter {
    public int titles = 14;
    public void show();
    
}

class Club implements Inter{
    public void show(){
        System.out.println("Real Madrid");
        System.out.println(titles);
    }

}

public class Prac1 {
    public static void main(String[] args) {
        // int num = 10;
        // Integer num1 = num;

        // System.out.println(num1);
        // System.out.println(num1.intValue());
        // Prac1 p = new Prac1();
        // System.out.println(p);
        // System.out.println(p.getClass());
        // System.out.println(p.getClass().getSuperclass());
        // System.out.println(p.getClass().getSuperclass().getName());

        // Parent c = new Child(10, 20);
        // c.show();

        // B obj = new B(90);
        // obj.show();
        // B obj1 = new B(obj);
        // obj1.show();

        Club c1 = new Club();
        c1.show();
    }
}