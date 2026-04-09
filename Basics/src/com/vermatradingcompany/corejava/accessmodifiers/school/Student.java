package com.vermatradingcompany.corejava.accessmodifiers.school;

public class Student {
    public String name;
    public int age;

    public static void sayHello() {
        System.out.println("Hello.........");
    }

    public void sayBye() {
        System.out.println("Bye bye....");
    }

    private Student() {

    }
}
