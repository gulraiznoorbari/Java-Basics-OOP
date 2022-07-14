package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum1();
        System.out.println(ans);
    }

    static int sum1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
