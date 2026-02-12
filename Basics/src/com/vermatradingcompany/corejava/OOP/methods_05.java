package com.vermatradingcompany.corejava.OOP;

public class methods_05 {
    public static void main(String[] args) {
        System.out.println(Sum(1,2,3,4,5,6,7,8,9));
    }

    public static int Sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
