package com.vermatradingcompany.corejava.OOP;

public class Car_01 {
    public static void main(String[] args) {
        Car car=new Car();
        car.model="Vitara Brezza";

        car.accelerate(51);
        System.out.println(car.speed);
    }
}
