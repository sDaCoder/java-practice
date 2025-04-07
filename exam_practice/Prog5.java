// implement multiple inheritance using interfaces
interface Animal {
    void eat();
}

interface Dog {
    void bark();
}

class Puppy implements Dog, Animal {
    public void eat() {
        System.out.println("Puppy is eating.");
    }

    public void bark() {
        System.out.println("Puppy is barking.");
    }
}

public class Prog5 {
    public static void main(String[] args) {
        Puppy P = new Puppy();
        P.eat();
        P.bark();
    }
}