class Calculator {
    public static int findNum(String s)
    {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = n * 10 + (int)(s.charAt(i) - '0');
        }
        return n;
    }

    public static int sumDigits(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int)(s.charAt(i) - '0');
        }
        return sum;
    }

    public static int findRev(String s)
    {
        int num = findNum(s), rev = 0, rem;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
}

public class Prog5 {
    public static void main(String args[]) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[0].length());
        System.out.printf("The number is: %s\n", args[0]);
        System.out.printf("The sum of all digits of %s is: %d\n", args[0], Calculator.sumDigits(args[0]));
        System.out.printf("The reverse of %s is: %d\n", args[0], Calculator.findRev(args[0]));
    }
}
