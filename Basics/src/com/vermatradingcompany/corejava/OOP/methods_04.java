package com.vermatradingcompany.corejava.OOP;

import java.util.Locale;

public class methods_04 {
    public static void main(String[] args) {
String a="Aman Verma";
        System.out.println(upper(a));
        System.out.println(a);
    }
    public static String upper(String str){
        return str.toUpperCase(Locale.ROOT);
    }
}
