package oop.polymorphism;

public class SportsCar extends Car {
    private int maxSpeed;

    public SportsCar(String brand, String model, int year, int maxSpeed) {
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
    }

    public void displayMaxSpeed() {
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }
}