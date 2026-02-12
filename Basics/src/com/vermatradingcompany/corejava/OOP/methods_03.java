package com.vermatradingcompany.corejava.OOP;

public class methods_03 {
    public static void main(String[] args) {
       int a=25, b =50 ,c=100;
        System.out.println(Num(a,b));
        System.out.println(Num(a,b,c));
        String str=" Akshita";
        System.out.println(str.substring(3));
    }

    public static int Num(int a ,int b){
        return a+b;
    }
    public static int Num(int a ,int b,int c){
        return a+b+c;
    }


}
