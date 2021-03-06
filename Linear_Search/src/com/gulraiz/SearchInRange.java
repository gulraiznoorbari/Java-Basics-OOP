package com.gulraiz;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7};
        System.out.print(linearSearch(nums, 6, 1,4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0){
            return -1;
        }
        for(int index=start; index <= end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
