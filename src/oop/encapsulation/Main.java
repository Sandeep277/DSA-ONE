package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.setYear(2021);
        System.out.println("Updated Year: " + myCar.getYear());
    }
}