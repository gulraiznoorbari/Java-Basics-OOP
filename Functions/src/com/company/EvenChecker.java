package com.company;

import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isEven(n);
        System.out.println(ans);
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
