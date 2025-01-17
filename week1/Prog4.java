import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        float sum = 0;

        Scanner S = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = S.nextInt();

        for (int i = 0; i < n; i++) {
            sum = sum +  1f/(i + 1);
        }
        System.out.printf("The sum is: %.2f\n", sum);
    }
}
