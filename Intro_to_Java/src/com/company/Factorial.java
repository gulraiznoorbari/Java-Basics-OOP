package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i, factorial = 1;
        int num = input.nextInt();
        for (i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
