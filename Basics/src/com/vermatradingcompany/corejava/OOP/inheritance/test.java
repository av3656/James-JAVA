package com.vermatradingcompany.corejava.OOP.inheritance;

public class test {
    public static void main(String[] args) {
        child Child = new child();
        parent Parent = new parent();
Child.setAge(2);
        System.out.println(Child.getAge());
        System.out.println(Child.isHasSuperPowers());
    }
}
