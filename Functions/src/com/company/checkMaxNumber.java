package com.company;

public class CheckMaxNumber {
    public static void main(String[] args) {
        int ans = max2(2,5,4);
        System.out.print(ans);
    }

    // Approach No.1
    static int max1(int a, int b, int c) {
        int max = a;
        if (c > max) {
            max = c;

        }
        if (b > max) {
            max = b;
        }
        return max;
    }

    // Approach No.2
    static int max2(int a, int b, int c) {
        int max = Math.max(a, Math.max(b,c));
        return max;
    }
}
