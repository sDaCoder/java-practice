package week2;

class Test{
    int x = 40;
    public void show()
    {
        System.out.println("The value of x is: " + this.x);
    }
}

public class Prog5 {

    public static void main(String[] args) {
        Test T = new Test();
        T.show();
    }
}