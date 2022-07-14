package com.company;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        isPalindrome(n);
    }

    static void isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Number is a Palindrome");
        } else {
            System.out.println("Number is not a Palindrome");
        }
    }
}
