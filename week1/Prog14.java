import java.util.Scanner;

public class Prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.printf("Enter %d integers to push into the array: ", n);
        for (int i = 0; i < arr.length; i++) 
        {
            int num = sc.nextInt();
            arr[i] = num;    
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println("The sum of all the integers of the array is: " + sum);
        System.out.println("The average of all the integers of the array is: " + (float)(sum / n));
    }
}
