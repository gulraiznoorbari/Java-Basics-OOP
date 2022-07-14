package com.gulraiz;

import java.util.Arrays;

public class BinarySearch2DArray {
    // Q: Binary Search in a Matrix that has both row and column sorted.
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {26,34,48,55},
                {28,38,50,59},
        };
        int target = 48;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
