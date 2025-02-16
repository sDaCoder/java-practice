package week3;

class Vehicle {
    String name;
    float speed;
    Vehicle(String name, float speed) {
        this.name = name;
        this.speed = speed;
    }
    void displayVehicle() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    float mileage;
    String fuelType;
    Car(String name, float speed, float mileage, String fuelType) {
        super(name, speed);
        this.mileage = mileage;
        this.fuelType = fuelType;
    }
    void displayCar() {
        super.displayVehicle();
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bike extends Vehicle {
    float mileage;
    String fuelType;
    Bike(String name, float speed, float mileage, String fuelType) {
        super(name, speed);
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    void displayBike() {
        super.displayVehicle();
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Car carVehicle = new Car("BMW", 150, 20.85f, "Diesel");       
        Bike bikVehicle = new Bike("TVS", 100, 18.56f, "Petrol");

        carVehicle.displayCar();
        System.out.println();
        bikVehicle.displayBike();
    }
}
