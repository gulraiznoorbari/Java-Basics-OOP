package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int output = 0;
        while (n > 0) {
            int remainder = n % 10;
            output = (output * 10) + remainder;
            n = n / 10;
        }
        System.out.println(output);
    }
}
