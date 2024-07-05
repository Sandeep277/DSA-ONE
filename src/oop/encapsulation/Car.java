package oop.encapsulation;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885) { // The first car was invented around 1886
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }
}