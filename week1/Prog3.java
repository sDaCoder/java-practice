import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the temperature in Farenheit: ");
        float F = S.nextFloat();
        float C = (F - 32) / 1.8f;

        System.out.println(F + " in Farenheit corresponds to " + C + " in Celcius");
    }
}
