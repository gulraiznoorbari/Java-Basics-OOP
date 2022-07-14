package com.gulraiz;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7};
        System.out.print(linearSearch(nums, 6));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for(int index=0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
