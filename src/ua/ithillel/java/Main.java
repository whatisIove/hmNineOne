package ua.ithillel.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setDoor(4);
        car.setEngine("eTECI4");
        car.setModel("Sens");
        car.setTransmission(5);
        car.setPassengers(6);
        String[] wheel = {"Front left" , "Front right", "Rear left", "Rear right"};
        car.setWheel(wheel);

        System.out.println("\nCar info:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Transmission: " + car.getTransmission());
        System.out.println("Wheels: " + Arrays.toString(car.getWheel()));
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Door: " + car.getDoor());
        System.out.println("Passengers " + car.getPassengers());

    }
}
