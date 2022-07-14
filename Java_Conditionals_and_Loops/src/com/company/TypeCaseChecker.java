package com.company;

import java.util.Scanner;

public class TypeCaseChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // trim(): removes trailing spaces.  charAt(): returns character at a specific index.
        if (ch > 'a' && ch < 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
