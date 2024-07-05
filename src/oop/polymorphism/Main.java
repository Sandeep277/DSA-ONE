package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car myCar = new SportsCar("Ferrari", "488", 2021, 211);
        myCar.displayInfo();

        if (myCar instanceof SportsCar) {
            ((SportsCar) myCar).displayMaxSpeed();
        }
    }
}