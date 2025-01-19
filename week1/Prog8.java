import java.util.Scanner;
import java.lang.Math;

public class Prog8 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("The sum of the series is: " + sum);

        sc.close();
    }
}
