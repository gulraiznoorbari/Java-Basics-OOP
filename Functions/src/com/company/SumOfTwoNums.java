package com.company;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = input.nextInt();
        System.out.print("Enter num2: ");
        int b = input.nextInt();
        System.out.println(sumOfNums(a, b));
    }

    static int sumOfNums(int a, int b) {
        return a + b;
    }
}
