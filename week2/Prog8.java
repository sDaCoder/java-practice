package week2;

import java.util.Scanner;

class Subject{
    String title;
    float internal_marks, theory_marks;
}

class Student{
    int roll;
    String name, stream, college;
    Subject SBS[];

    Student(int roll, String name, String stream, String college)
    {
        this.roll = roll;
        this.name = name;
        this.stream = stream;
        this.college = college;
        this.SBS = new Subject[6];
    }

    Student(int roll, String name, String stream, String college, int total_subjects)
    {
        this.roll = roll;
        this.name = name;
        this.stream = stream;
        this.college = college;
        this.SBS = new Subject[total_subjects];
    }

    void showDetails()
    {
        System.out.println("The name of the student is: " + this.name);
        System.out.printf("The stream of %s is %s bearing roll number %d\n", this.name, this.stream, this.roll);
        System.out.printf("%s reads in %s college\n\n", this.name, this.college);
    }

    void inputMarks()
    {
        for(Subject i : SBS)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the subeject and its internal and theory marks: ");
            i.title = sc.next();
            i.internal_marks = sc.nextFloat();
            i.theory_marks = sc.nextFloat();
            sc.close();
        }
    }

    void showMarks()
    {
        for(Subject i : SBS)
        {
            float total = i.internal_marks + i.theory_marks;
            System.out.printf("%s: %.2f", i.title, total);
        }
    }
}

public class Prog8 {

    public static void main(String[] args) 
    {
        Student S1 = new Student(23, "Suprava", "CSE", "IEM", 4);
        S1.showDetails();
        // S1.inputMarks();
        // S1.showMarks();
        
        Student S2 = new Student(45, "Rounak", "ECE", "IEM");
        S2.showDetails();
        // S2.inputMarks();
        // S2.showMarks();
    }
}