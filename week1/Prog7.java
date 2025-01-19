import java.util.Scanner;

class Solution{
    public static int fib(int n)
    {
        if(n == 0 || n == 1) return n;

        return fib(n - 1) + fib(n - 2);
    }
}

public class Prog7 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            System.out.printf("%d ", Solution.fib(i));
        }
        sc.close();
    }
}
