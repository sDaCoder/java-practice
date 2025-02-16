package week2;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        if(args.length == 1 || args.length >= 3)
        {
            System.out.println("Enter two integers only!");
            return;
        }
        float a, b;
        if(args.length == 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            a = sc.nextFloat();
            b = sc.nextFloat();
            sc.close();
        }

        else
        {
            a = Float.parseFloat(args[0]);
            b = Float.parseFloat(args[1]);
        }

        System.out.printf("%.2f + %.2f = %.2f\n", a, b, (a + b));
    }
}