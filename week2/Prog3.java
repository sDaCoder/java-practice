package week2;
import java.lang.Math;
import java.util.Scanner;

class Cone{
    float r, h, area, volume;

    Cone(float r, float h)
    {
        this.r = r;
        this.h = h;
        
        this.volume = (22 / 21) * r * r * h;
        float l = (float)Math.sqrt(r * r + h * h);
        this.area = (22 / 7) * r * l;
    }
}

public class Prog3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of the Cone: ");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        sc.close();

        Cone C = new Cone(r, h);
        System.out.println(C.volume);
        System.out.println(C.area);
    }
}