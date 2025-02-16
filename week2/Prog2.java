package week2;
import java.util.Scanner;

class Cylinder {
    float r, h, area, volume;

    Cylinder(float r, float h)
    {
        this.r = r;
        this.h = h;
        this.volume = (22 / 7) * r * r * h;
        this.area = (22 / 7) * 2 * r * h;
    }
}

public class Prog2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of the Cylinder: ");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        sc.close();

        Cylinder C = new Cylinder(r, h);
        System.out.println("The area of the cylinder is: " + C.area);
        System.out.println("The volume of the cylinder is: " + C.volume);
    }
}