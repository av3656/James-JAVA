package com.vermatradingcompany.corejava.OOP;

public class methods_06 {
    public static void main(String[] args) {
        System.out.println(isPrime(131));
        System.out.println(isPrime(135));
        System.out.println(isPrime(2));
    }

    public static boolean isPrime(int x) {
        int res = 0;
        for (int i = 1; i < x / 2; i++) {
            if (x % i == 0) {
                res++;
            }
        }
        return res == 1;
    }

}
