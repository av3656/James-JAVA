package com.vermatradingcompany.corejava.basic;

public class array_01 {
    public static void main(String[] args) {
//        int arr[] = new int[10];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int arr[] = {4, 6, 8, 10, 12, 14, 16, 18, 20};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

//        for (int i : arr1) {
//            System.out.println(i);
//      for (int i : arr1) {
//          if (i == 18) {
//              System.out.println("Found");
//           }
//        }


//        Find the highest element from an array.....
        int aman[] = new int[6];
        aman[0] = 197;
        aman[1] = 449;
        aman[2] = 35;
        aman[3] = 63;
        aman[4] = 98;
        aman[5] = 46;

        int res = Integer.MIN_VALUE;
        for (int i : aman) {
            if (i > res) {
                res = i;
            }
        }
        System.out.println(res);

    }
}
