import java.util.Scanner;

public class Prog11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        try {
            System.out.printf("%d / %d = %f\n", num1, num2, (float)(num1 / num2));
        } catch (ArithmeticException e) {
            System.out.printf("%d / %d = undefined\n", num1, num2);
        } finally {
            System.out.println("Division operation completed");
        }
    }
}