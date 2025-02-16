package week3;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    int roll;
    String course;
    
    Student(String name, int age, int roll, String course){
        super(name, age);
        this.roll = roll;
        this.course = course;
    }
    void display(){
        super.display();
        System.out.println("Roll Number: " + roll);
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person{
    String subject;
    int salary;

    Teacher(String name, int age, String subject, int salary){
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    void display(){
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class Prog1 {
    public static void main(String[] args) {
        Person P = new Person("Suprava", 41);
        P.display();
        System.out.println();

        Student S = new Student("Rohan", 20, 405, "ECE");
        S.display();
        System.out.println();

        Teacher T = new Teacher("Subham", 50, "DSA", 150000);
        T.display();
    }
}
