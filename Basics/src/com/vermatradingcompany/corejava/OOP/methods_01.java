package com.vermatradingcompany.corejava.OOP;

public class methods_01 {
    public static void main(String[] args) {
        int[] a = {3, 6, 3, 7, 9, 4, 6,};

        int[] b = {34, 56, 34, 24, 243, 34, 24, 45, 45, 45};
        int b_01 = SumOfArray(b);

        System.out.println(SumOfArray(a));
        System.out.println(b_01);
    }

    public static int SumOfArray(int[] arr) {

        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }
}
