package com.vermatradingcompany.corejava.OOP;

public class encapsulation_02 {
    public static void main(String[] args) {
//        encapsulation_01 Student = new encapsulation_01();
//
//        Student.setAge(-15);
//        System.out.println(Student.getAge());

        constructor_01 Student=new constructor_01("Aman",28,20);
        System.out.println(Student.getName());
        System.out.println(Student.getRoll_Number());
        System.out.println(Student.getAge());

        constructor_01 Student_01=new constructor_01(-25);
        System.out.println(Student_01.getAge());
    }
}
