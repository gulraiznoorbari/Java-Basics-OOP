package com.gulraiz;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        // Syntax-1  Here 3 = no. of rows and 2 = no. of columns.
//        int[][] arr1 = new int[3][2];

        // Syntax-2
//        int[][] arr2 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };

        // Taking input for every index in a 2D array:
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // Taking Input:
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // Taking Output:
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Taking Output (using toString() method):
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Taking Output (using for-each loop & toString() method):
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}
