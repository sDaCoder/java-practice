package week4;

public class Prog2 {
    public static void main(String[] args) {
        String sen = "I am learning java, and I'm in second year of my college.";
        String[] words = sen.split(" ");

        // int countWords = 0;
        // for (String word : words) {
        //     countWords++;
        // }
        // System.out.println(countWords);
        System.out.println("The number of words of the given sentence is: " + words.length);
    }
}
