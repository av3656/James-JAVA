package com.vermatradingcompany.corejava.interfaces.animal;

public interface Animal {
    public abstract void eat();

    void sleep();

    public static final int MAX_AGE = 150;

   static void info(){
       System.out.println("This is animal interface.");
    }

    default void run (){
       this.sleep();
        System.out.println("Animal is running.");
    }
}
