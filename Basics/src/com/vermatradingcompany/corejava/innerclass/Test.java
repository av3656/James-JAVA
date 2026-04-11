package com.vermatradingcompany.corejava.innerclass;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();


        Computer computer = new Computer("Apple", "M4 Air", "Macos Tahoe");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("Type-C");
        usb.displayInfo();


        ShoppingCart shoppingcart = new ShoppingCart(999);
        shoppingcart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid amount of " + amount + " using credit card.");
            }
        });

        shoppingcart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid amount of " + amount + " using UPI.");
            }
        });


        Hotel hotel = new Hotel("Micasa Ducasa", 10, 7);
        hotel.reservedRoom("Akshit", 3);
        hotel.reservedRoom("Aman", 1);
        hotel.reservedRoom("", 1);
        hotel.reservedRoom("Aman", -1);
    }
}
