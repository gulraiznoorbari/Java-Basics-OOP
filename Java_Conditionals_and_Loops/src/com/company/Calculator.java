package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int output = 0;
        while (true) {
            System.out.print("Enter a operator: ");
            char operator = input.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (operator == '+') {
                    output = num1 + num2;
                }
                if (operator == '-') {
                    output = num1 - num2;
                }
                if (operator == '*') {
                    output = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        output = num1 / num2;
                    }
                }
                if (operator == '%') {
                    output = num1 % num2;
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operation!!!");
            }
            System.out.println(output);
        }
    }
}
