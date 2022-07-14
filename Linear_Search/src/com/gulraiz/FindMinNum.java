package com.gulraiz;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6};
        System.out.println(minNum(arr));
    }

    static int minNum(int[] nums) {
        int ans = nums[0];
        for (int i=1; i < nums.length; i++) {
            if(nums[i] < ans) {
                ans = nums[i];
            }
        }
        return ans;
    }
}
