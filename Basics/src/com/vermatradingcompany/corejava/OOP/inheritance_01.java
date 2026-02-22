package com.vermatradingcompany.corejava.OOP;

public class inheritance_01 {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inherits(){
        System.out.println("This is the concept of Inheritance");
    }

    public void sayHello(){
        System.out.println("Hello, how are you?");
    }
}
