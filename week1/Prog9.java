class Calculator{
    public static int findNum(String s)
    {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = n * 10 + (int)(s.charAt(i) - '0');
        }
        return n;
    }
}

public class Prog9 {
    public static void main(String[] args) {
        int p = Calculator.findNum(args[0]);
        int n = Calculator.findNum(args[1]);
        int r = Calculator.findNum(args[2]);

        System.out.printf("The interest is: %.2f\n", (float)(p * n * r) / 100);
    }
}
