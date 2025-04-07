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

class Cat extends Animal {
    public void sound() {
        super.sound();
        System.out.println("The cat meows");
    }
}

public class Prog3 {

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}