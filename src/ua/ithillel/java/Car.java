package ua.ithillel.java;

public class Car {

    private String model;
    private String wheel[];
    private int transmission;
    private String engine;
    private int door;
    private int passengers;

    public Car() {
    }

    public Car(String model, String[] wheel, int transmission, String engine, int door, int passengers) {
        this.model = model;
        this.wheel = wheel;
        this.transmission = transmission;
        this.engine = engine;
        this.door = door;
        this.passengers = passengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String[] getWheel() {
        return wheel;
    }

    public void setWheel(String[] wheel) {
        this.wheel = wheel;
    }

    }

