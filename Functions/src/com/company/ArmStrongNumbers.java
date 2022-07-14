package com.company;

public class ArmStrongNumbers {
    public static void main(String[] args) {
//        boolean ans = armstrong(153);
//        System.out.println(ans);

        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // A number that is equal to the sum of cubes of its digits.
    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            int cube = rem * rem * rem;
            sum += cube;
        }
        return sum == original;
    }
}

