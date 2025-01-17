class Solution{
    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

public class Prog6 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < args[0].length(); i++) 
        {
            n = n * 10 + (int)(args[0].charAt(i) - '0');
        }
        System.out.printf("%d! = %d\n", n, Solution.factorial(n));
    }
}
