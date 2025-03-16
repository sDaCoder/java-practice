package week4;

public class Prog4 {

    public static void main(String[] args) {
        String sen = "I am learning java, and I'm in second year of my college.";
        String[] words = sen.split(" ");

        int longestWord = Integer.MIN_VALUE;
        for (String word : words) {
            longestWord = Math.max(longestWord, word.length());
        }
        System.out.println(longestWord);
    }
}