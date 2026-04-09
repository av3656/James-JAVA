package com.vermatradingcompany.corejava.OOP.Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();

        Animal dog = new Dog();  //upcasting
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();
    }
}
