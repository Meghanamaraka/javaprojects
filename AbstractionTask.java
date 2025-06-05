package xyz;
abstract class Car {
    abstract void start();
    abstract void drive();
    abstract void stop();
}

class DriverCar extends Car {
    void start() {
        System.out.println("Car started using key or push button.");
    }

    void drive() {
        System.out.println("Driving using:");
        System.out.println("- Steering Wheel");
        System.out.println("- Accelerator Pedal");
        System.out.println("- Brake Pedal");
        System.out.println("- Gear Lever");
        System.out.println("- Seatbelt");
        System.out.println("- Mirrors");
    }
    void stop() {
        System.out.println("Car stopped.");
    }
}

public class AbstractionTask {
    public static void main(String[] args) {
        Car myCar = new DriverCar();
        myCar.start();
        myCar.drive();
        myCar.stop();
    }
}