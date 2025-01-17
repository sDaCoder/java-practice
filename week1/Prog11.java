import java.util.Scanner;

class Solution{
    public static boolean checkPrime(int n)
    {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

public class Prog11
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int l1 = sc.nextInt();
        
        System.out.print("Enter the upper limit: ");
        int l2 = sc.nextInt();

        l1 = (l1 > 2) ? l1 : 2;

        for (int i = l1; i <= l2; i++) {
            if(Solution.checkPrime(i)) System.out.printf("%d ", i);
        }
    }
}