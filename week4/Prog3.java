package week4;

public class Prog3 {

    public static void main(String[] args) {
        String s = "aabbbbbccddddd";
        boolean present[] = new boolean[256];
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if(present[s.charAt(i)] == false) {
                present[s.charAt(i)] = true;
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}