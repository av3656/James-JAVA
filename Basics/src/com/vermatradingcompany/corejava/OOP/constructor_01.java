package com.vermatradingcompany.corejava.OOP;

public class constructor_01 {
    private String Name;

    private int Roll_Number;

    private int age;


    public constructor_01(String Name, int Roll_Number, int age) {
        this.Name = Name;
        this.Roll_Number = Roll_Number;
        this.age = age;

    }

    public constructor_01(int age) {
        if (age<0){
            System.out.println("Invalid Age");
        }
        else {
            this.age = age;
        }
    }


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
}
