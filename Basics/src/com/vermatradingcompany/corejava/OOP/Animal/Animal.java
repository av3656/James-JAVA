package com.vermatradingcompany.corejava.OOP.Animal;

import java.net.StandardSocketOptions;

public class Animal {
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public void eat(){
        System.out.println("Something eating....");
    }

    public void sayHello(){
        System.out.println("Saying something.....");
    }

}
