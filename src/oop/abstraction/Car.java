package oop.abstraction;

public class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void honk() {
        System.out.println("Car honk: Beep Beep!");
    }
}