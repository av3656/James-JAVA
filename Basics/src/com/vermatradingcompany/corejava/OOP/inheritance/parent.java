package com.vermatradingcompany.corejava.OOP.inheritance;

import java.util.SplittableRandom;

public class parent extends grandfather{
public parent(int age , String name){
    super(age , name);
    System.out.println("Parent constructor is called");
}
public void parentMethod(){
    System.out.println("Parent method called");
}
  
}
