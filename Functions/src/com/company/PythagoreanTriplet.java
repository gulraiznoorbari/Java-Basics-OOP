package com.company;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = input.nextInt();
        System.out.print("Enter num2: ");
        int b = input.nextInt();
        System.out.print("Enter num3: ");
        int c = input.nextInt();
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("Triplet is Pythagorean.");
        } else {
            System.out.println("Triplet is not Pythagorean.");
        }
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max == a) {
            return (b * b) + (c * c) == (a * a);
        } else if (max == b) {
            return (a * a) + (c * c) == (b * b);
        } else {
            return (a * a) + (b * b) == (c * c);
        }
    }
}
