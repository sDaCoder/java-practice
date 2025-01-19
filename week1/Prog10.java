import java.util.Scanner;
import java.lang.Math;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();
        
        System.out.print("c = ");
        int c = sc.nextInt();

        float D = b * b - 4 * a * c;

        if (D >= 0) {
            float x1 = (-b + (float)(Math.sqrt(D))) * 1f / (2 * a);
            float x2 = (-b - (float)(Math.sqrt(D))) * 1f / (2 * a);
            System.out.printf("The roots of the equation are %.2f and %.2f\n", x1, x2);
        }
        else{
            D = -D;
            float real = (-b * 1f) / (2 * a);
            float img = (float)(Math.sqrt(D)) * 1f / (2 * a);
            System.out.printf("The complex roots of the equation are (%.2f + %.2fi) and (%.2f + %.2fi)\n", real, img, real, img);
        }

        sc.close();
    }
}
