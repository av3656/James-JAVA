package com.vermatradingcompany.corejava.basic;

public class arr_02 {
    public static void main(String[] args) {
//        Two Dimensional Array
//        int arr[][] = new int[3][3];

        int matrix[][] = {
                {1, 2},
                {4, 5, 6},
                {7,}
        };

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(matrix[i][j] +" ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }





    }
}
