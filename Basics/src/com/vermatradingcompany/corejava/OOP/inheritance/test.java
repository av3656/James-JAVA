package com.vermatradingcompany.corejava.OOP.inheritance;

public class test {
    public static void main(String[] args) {
 /*       child Child = new child();
Child.childMethod();
Child.setAge(2);
Child.setName("Akshu");
        System.out.println(Child.getAge());
        System.out.println(Child.isHasSuperPowers());
        System.out.println(Child.getName());*/


        child C=new child(19,"Akshu");
        System.out.println(C.getAge());
        C.childMethod();
    }
}
