package com.company;

import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.println(naturalnumbers(n));
    }

    static int naturalnumbers(int n) {
        if (n < 1) {
            System.out.println("Not Natural Number");
        }
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
