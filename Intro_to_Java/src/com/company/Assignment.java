package com.company;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q2: Program to check whether a number is even or odd.
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Q3: Print greeting message for a name.
//        System.out.print("Enter a name: ");
//        String name = input.next();
//        System.out.println("Welcome " + name + "!");

        // Q4: Program to calculate simple interest.
//        System.out.print("Principle Amount: ");
//        int principle = input.nextInt();
//        System.out.print("Time (Years): ");
//        int time = input.nextInt();
//        System.out.print("Rate (%): ");
//        float rate = input.nextFloat();
//        float interest = principle * rate * time / 100;
//        System.out.println("Simple Interest: " + interest);

        // Q5: Calculate the value.
//        System.out.print("Enter Number 1: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter Number 2: ");
//        int num2 = input.nextInt();
//        System.out.print("Choose a operator (+, -, *, /): ");
//        String operator = input.next();
//        if (operator.equals("+")) {
//            int add = num1 + num2;
//            System.out.println("Answer: " + add);
//        } else if (operator.equals("-")) {
//            int subtract = num1 - num2;
//            System.out.println("Answer: " + subtract);
//        } else if (operator.equals("*")) {
//            int multiply = num1 * num2;
//            System.out.println("Answer: " + multiply);
//        } else if (operator.equals("/")) {
//            int division = num1 / num2;
//            System.out.println("Answer: " + division);
//        }

        // Q6: Print largest among two numbers.
//        System.out.print("Enter number 1: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = input.nextInt();
//        if (num1 > num2) {
//            System.out.println("Larger number: " + num1);
//        } else if (num1 < num2) {
//            System.out.println("Larger number : " + num2);
//        } else {
//            // if num1 == num2:
//            System.out.println("Both numbers are equal");
//        }

        // Q7: Print all factors of a number.
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        int i = 1;
//        System.out.print("Factors of "  + num + " are: ");
//        for (i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.print(i + " ");
//            }
//        }

        // Q8: Rupee to Dollar.
//        System.out.print("Enter Amount in Rupees: ");
//        int amount = input.nextInt();
//        float dollar_rate = 164;
//        float dollars = amount / dollar_rate;
//        System.out.println(dollars + " Dollars");

        // Q9: Integer inputs till user enters 0 and print sum.
//        int sum = 0;
//        while (true) {
//            System.out.print("Enter number (0 to terminate): ");
//            int num = input.nextInt();
//            if (num == 0) {
//                break;
//            } else {
//                sum += num;
//            }
//        }
//        System.out.println("Sum of numbers: " + sum);

        // Q10: Integer inputs till user enters 0 and print largest number.
//       int large = 0;
//        while (true) {
//            System.out.print("Enter number (0 to terminate): ");
//            int num = input.nextInt();
//            if (num == 0) {
//                break;
//            } else {
//                for (int i = 2; i < num; i++) {
//                    if (num > large) {
//                        large = num;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println("Largest Number: " + large);

    }
}
