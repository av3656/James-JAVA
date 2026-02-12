package com.vermatradingcompany.corejava.OOP;

public class encapsulation_01 {

   private String Name;

    private int Roll_Number;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
            age = 0;
        }
        this.age = age;
    }

    public int getRoll_Number() {
        return Roll_Number;
    }

    public void setRoll_Number(int roll_Number) {
        Roll_Number = roll_Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void main(String[] args) {

    }
}
