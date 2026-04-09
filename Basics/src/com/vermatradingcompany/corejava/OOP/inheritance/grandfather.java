package com.vermatradingcompany.corejava.OOP.inheritance;

public class grandfather {
   private String name;

   private int age;

   private boolean hasSuperPowers;
   public grandfather(int age , String name){
       this.age=age;
       this.name=name;
       hasSuperPowers=true;
       System.out.println("grand-father constructor called");
   }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasSuperPowers() {
        return hasSuperPowers;
    }

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
