package week4;

public class Prog4 {

    public static void main(String[] args) {
        String sen = "I am learning java, and I'm studying this subject in second year of my college";
        String[] words = sen.split(" ");


        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > words[index].length()) {
                index = i;
            }
        }
        System.out.println(words[index]);
    }
}