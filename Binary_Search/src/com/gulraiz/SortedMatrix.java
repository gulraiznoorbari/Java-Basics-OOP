package com.gulraiz;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    // Search in the rows provided between the columns provided:
    static int[] binarySearch (int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            else if (target > matrix[row][mid]) {
                colStart = mid + 1;
            }
            else if (target < matrix[row][mid]) {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search (int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int midCol = cols / 2;

        // Run loop till 2 rows are remaining:
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (target == matrix[mid][midCol]) {
                return new int[]{mid, midCol};
            }
            else if (target > matrix[mid][midCol]) {
                 rowStart = mid;
            }
            else if (target < matrix[mid][midCol]) {
                rowEnd = mid;
            }
        }
        // Now we have 2 rows:
        // Check whether the target is in the column of 2 rows:
        if (matrix[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        }
        if (matrix[rowStart + 1][midCol] == target) {
            return new int[]{rowStart + 1, midCol};
        }
        // search in first half:
        if (target <= matrix[rowStart][midCol - 1]) {
            return binarySearch(matrix, rowStart, 0, midCol - 1, target);
        }
        // search in second half:
        else if (target >= matrix[rowStart][midCol + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, midCol + 1, cols - 1, target);
        }
        // search in third half:
        else if (target <= matrix[rowStart + 1][midCol - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, midCol - 1, target);
        }
        // search in fourth half:
        // if (target >= matrix[rowStart + 1][midCol + 1])
        else {
            return binarySearch(matrix, rowStart + 1, midCol + 1, cols - 1, target);
        }
    }
}
