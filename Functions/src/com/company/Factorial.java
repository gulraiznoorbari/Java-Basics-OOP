package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        factorial(n);
    }

    static void factorial(int n) {
        if (n == 0 || n == 1) {
            System.out.println("1");
        }
        int ans = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
        }
        System.out.println(ans);
    }
}
