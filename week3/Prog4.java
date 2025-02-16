package week3;

class Appliance{
    String name;
    float price;
    Appliance(String name, float price){
        this.name = name;
        this.price = price;
    }
}

class WashingMachine extends Appliance{
    int capacity;
    WashingMachine(String name, float price, int capacity){
        super(name, price);
        this.capacity = capacity;
    }
}

class SmartWashingMachine extends WashingMachine{
    boolean wifiEnabled;
    boolean smartphoneAppAvailable;
    SmartWashingMachine(String name, float price, int capacity, boolean wifiEnabled, boolean smartphoneAppAvailable){   
        super(name, price, capacity);
        this.wifiEnabled = wifiEnabled;
        this.smartphoneAppAvailable = smartphoneAppAvailable;
    }
}

public class Prog4 {
    public static void main(String[] args) {
        SmartWashingMachine SWM = new SmartWashingMachine("Samsung", 1000.0f, 8, true, true);
        System.out.println(SWM.name + " is a smart washing machine. ");
        System.out.println("It has a capacity of " + SWM.capacity + " kg. ");
        System.out.print("It is ");
        if (SWM.wifiEnabled == true) {
            System.out.print("wifi enabled, ");
        } else {
            System.out.print("not wifi enabled, ");
        }
        if (SWM.smartphoneAppAvailable == true) {
            System.out.println("and smartphone app available.");
        } else {
            System.out.println("and no smartphone app available.");
        }
    }
}
