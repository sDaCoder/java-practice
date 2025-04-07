package week5;

public class Prog1 {

    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

    }
}