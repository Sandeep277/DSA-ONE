package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Camry", 2020);
        myCar.displayInfo();
        myCar.honk();
    }
}