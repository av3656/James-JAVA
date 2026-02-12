package com.vermatradingcompany.corejava.OOP;

public class recursion_02 {
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumber(7));
    }

    public static int sumOfNNaturalNumber(int x){
       if (x==1){
           return 1;
       }
        return x + sumOfNNaturalNumber(x-1);
    }

}
