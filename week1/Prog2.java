import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price in Rupees: ");

        float price = sc.nextFloat();
        
        if (price * 100 == (int)(price * 100)) 
        {
            System.out.println("Rs. " + price + " in paisa is: " + (int)(price * 100));
        }
        else
        {
            System.out.println("Invalid amount enetered");
        }
    }
}
