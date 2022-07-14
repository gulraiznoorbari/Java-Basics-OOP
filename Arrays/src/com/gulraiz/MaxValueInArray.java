package com.gulraiz;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr1 = {30,62,58,44,71};
        System.out.println(maxValue(arr1));
        int[] arr2 = {1,2,3,4,5,6,7,8,44,23};
        System.out.println(maxValueInRange(arr2, 2, 6));
    }

    static int maxValue(int[] arr) {
        int max = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int maxValueInRange(int[] arr, int index1, int index2) {
        int max = arr[index1];
        if (index1 > index2) {
            return -1;
        }
        for (int i = max; i <= arr[index2]; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
