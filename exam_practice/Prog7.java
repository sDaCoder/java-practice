package exam_practice;

abstract class Vehicle{
    String name;
    abstract void start();
}

class Car extends Vehicle{
    Car(String name){ this.name = name; }
    void start(){
        System.out.println(this.name + " has started");
    }
}

class Bike extends Vehicle{
    Bike(String name){ this.name = name; }
    void start(){
        System.out.println(this.name + " has started");
    }
}

public class Prog7 {

    public static void main(String[] args) {
        Car C = new Car("BMW");
        Bike B = new Bike("TVS");
        C.start();
        B.start();
    }
}