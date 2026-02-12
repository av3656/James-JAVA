package com.vermatradingcompany.corejava.OOP;

public class recursion_01 {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

    public static int Factorial(int x){
       if (x==1){
           return 1;
       }
        return x * Factorial(x-1);
    }

}
