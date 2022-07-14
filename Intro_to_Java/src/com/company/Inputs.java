package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter you roll number: ");
//        int rollNumber = input.nextInt();
//        System.out.println("Your Roll Number is " + rollNumber);

        // Use underscore to keep track of thousands and millions:
        int a = 1_000_000;
        System.out.println(a);

        // Print First word
//        String name = input.next();
//        System.out.println(name);

        // Print whole line
//        String line = input.nextLine();
//        System.out.println(line);

        // Print float
        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
