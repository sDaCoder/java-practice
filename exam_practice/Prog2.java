package exam_practice;

class Animal {

    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        super.sound();
        System.out.println("The dog barks");
    }
}

class BabyDog extends Dog {
    public void sound() {
        super.sound();
        System.out.println("The baby dog can also make a sound");
    }
}

public class Prog2 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        BabyDog d2 = new BabyDog();
        d2.sound();
        // Animal d2 = new Dog();
        // d2.sound();

        // Animal d3 = new Animal();
        // d3.sound();
    }
}
