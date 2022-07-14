package com.gulraiz;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {22,38,75},
                {57,49,99,107},
                {290,44,57,78},
        };
        System.out.print(max(nums));
    }

    static int max(int[][] arr) {
        int max = 0;
        for (int row=0; row < arr.length; row++) {
            for (int col=0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
