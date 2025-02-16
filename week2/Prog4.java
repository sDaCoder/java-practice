package week2;

public class Prog4 {
    int x = 40;
    void show()
    {
        System.out.println("The value of x is: " + this.x);
    }
    public static void main(String[] args) {
        Prog4 myProg4 = new Prog4();
        myProg4.show();
    }
}