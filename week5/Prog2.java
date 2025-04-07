package week5;

public class Prog2 {

    float division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10, b = 0;

        System.out.println(new Prog2().division(a, b));
    }
}