package com.company;

import java.util.Scanner;

public class ProductOfTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = input.nextInt();
        System.out.print("Enter num2: ");
        int b = input.nextInt();
        System.out.println(productOfNums(a, b));
    }

    static int productOfNums(int a, int b) {
        return a * b;
    }
}
