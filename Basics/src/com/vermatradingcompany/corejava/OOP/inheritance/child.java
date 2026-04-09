package com.vermatradingcompany.corejava.OOP.inheritance;

public class child extends parent{

    public child(int age , String name){
        super(age , name);
        System.out.println("Child constructor is called");
    }

    public void childMethod(){
        super.parentMethod();
        System.out.println("Child Method called");
    }
    public static void main(String[] args) {



    }
}
