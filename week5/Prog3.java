package week5;

public class Prog3 {

    public static void main(String[] args) {
        int age = 13;

        if(age < 18) {
            throw new IllegalArgumentException("Age should be greater than 18.");
        }
        System.out.println("Eligible for voting.");
    }
}