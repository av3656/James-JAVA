package com.vermatradingcompany.corejava.interfaces.animal;

public class Test {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();
        Animal cat=new Cat();
        cat.sleep();
        System.out.println(dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Animal.info();
        dog.run();
        cat.run();
    }
}
