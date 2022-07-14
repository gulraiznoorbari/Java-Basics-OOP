package com.gulraiz;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.print(ceiling(nums, target));
    }
    // Ceiling: Smallest Number >= target number.
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // If target is greater than the largest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
