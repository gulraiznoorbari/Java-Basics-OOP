package com.company;

import java.util.Scanner;

public class PrimeNumber {
    // Runtime Complexity: O(sqrt(n))
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime Number");
            return;
        }
        int c = 2;
        if (num == 4) {
            System.out.println("Not Prime Number");
        } else {
            while (c * c < num) {
                if (num % c == 0) {
                    System.out.println("Not Prime Number");
                    return;
                } c++;
            }
            if (c * c > num) {
                System.out.println("Prime Number");
            }
        }
    }
}
