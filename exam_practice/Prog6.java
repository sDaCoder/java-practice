package exam_practice;

class Student{
    String name;
    int age, roll;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
    
    Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.roll);
        System.out.println();
    }

}

public class Prog6 {
    public static void main(String[] args) {
        Student S = new Student("Suprava", 20);
        Student S1 = new Student("Suprava", 20, 405);
    }
}