package main;

import org.jetbrains.annotations.Contract;

public abstract class Vehicle {

    private double weight;
    private String poweredBy;
    private int numberOfPassangers;

    @Contract(pure = true)
    public Vehicle(double weight, String poweredBy, int numberOfPassangers) {
        this.weight = weight;
        this.poweredBy = poweredBy;
        this.numberOfPassangers = numberOfPassangers;
    }

    public double getWeight() {
        return weight;
    }

    public String getPoweredBy() {
        return poweredBy;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }
}
