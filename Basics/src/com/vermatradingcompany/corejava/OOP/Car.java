package com.vermatradingcompany.corejava.OOP;

public class Car {
    private String color;

    private String brand;

    String model;

    private int year;

    int speed;

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed += decrement;
    }
}
