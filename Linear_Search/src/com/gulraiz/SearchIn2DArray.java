package com.gulraiz;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {22,38,75},
                {57,49,99,107},
                {290,44,57,78},
        };
        int target = 44;
        int[] ans = search(nums, target);
        System.out.print(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row=0; row < arr.length; row++) {
            for (int col=0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
