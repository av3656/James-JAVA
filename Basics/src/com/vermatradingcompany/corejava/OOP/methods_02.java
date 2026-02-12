package com.vermatradingcompany.corejava.OOP;

import java.util.Locale;

public class methods_02 {
    public static void main(String[] args) {
String a=" A   frhee  fff     ";
String z=upperFun(a);
        System.out.println(z);
    }

    private static String upperFun(String str){
        return str.trim().toUpperCase(Locale.ROOT);
    }

}
