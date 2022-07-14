package com.company;

import java.util.Scanner;

public class StringParameters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.next();
        String personalized = greet(name);
        System.out.println(personalized);
    }

    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }


}
