package com.vermatradingcompany.corejava.OOP;

public class inheritance_03 {
    public static void main(String[] args) {
      inheritance_02 A=new inheritance_02();
      A.setAge(12);
      A.setName("Rocky");
      A.sayHello();
        A.inherits();
        System.out.println(A.getAge());
        System.out.println(A.getName());
    }
}
