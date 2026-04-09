package com.vermatradingcompany.corejava.basic.useofstatic;

public class Student {

    static {
        System.out.println("Hello everyone");
    }

    private static int count=0;
    public Student(){
        count++;
    }

    private int id;
    private String name;
    private int rollNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollNumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollNumber = rollnumber;
    }

   public static int getCount(){
        return count;
    }
}
