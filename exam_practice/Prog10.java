import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = sc.nextLine();
        sc.close();
        int arr[] = new int[]{1, 2, 3, 4, 5};
        // Convert string to int
        try {
            Integer num = Integer.parseInt(str);
            System.out.println("The number is: " + num);
            System.out.println(arr[num]);
        } catch (NumberFormatException e) {
            System.out.println(str + " is not a number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access index " + str + " in array");
        } catch (Exception e) {
            System.out.println("Caught" + e);
        } finally {
            System.out.println("Program completed");
        }
    }
}
