package com.vermatradingcompany.corejava.basic.useofstatic;

public class Test {
    public static void main(String[] args) {
        Student aman = new Student();
        Student akshu = new Student();
        Student ashish = new Student();
        Student angad = new Student();
        Student aay = new Student();
        Student akshit = new Student();
        Student arpit = new Student();
        Student akash = new Student();

        System.out.println(Student.getCount());
        System.out.println(Utils.trimAndUppercase("amdfmwidhsbcjAmdkncjdbcakaSJk"));


        School instance = School.getInstance();
        System.out.println(Utils.PI);
    }
}
