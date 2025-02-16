package week3;

class Animal{
    String animalName;
    void speak() { System.out.println("I am an animal."); }
}

class Dog extends Animal{
    void speak() {
        super.speak();
        System.out.println("I am a dog.");
    }
}

class Cat extends Animal{
    void speak() {
        super.speak();
        System.out.println("I am a cat.");
    }
}

class Cow extends Animal{
    void speak() {
        super.speak();
        System.out.println("I am a cow.");
    }
}

public class Prog2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        dog.speak();
        System.out.println();
        cat.speak();
        System.out.println();
        cow.speak();
    }
}
