import java.util.Scanner;

class Solution{
    public static int GCD(int num1, int num2)
    {
        int large = (num1 > num2) ? num1 : num2;
        int small = (num1 < num2) ? num1 : num2;

        int gcd = 1;
        for (int i = small; i <= large; i++) 
        {
            if((small % i == 0 && large % i == 0)) gcd = i;
        }
        return gcd;
    }
}

public class Prog12 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = S.nextInt();
        int n2 = S.nextInt();

        System.out.printf("The GCD of %d and %d is %d\n", n1, n2, Solution.GCD(n1, n2));

    }
}
