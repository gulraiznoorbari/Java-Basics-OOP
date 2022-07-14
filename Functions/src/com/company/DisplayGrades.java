package com.company;

import java.util.Scanner;

public class DisplayGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        grades(n);
    }

    static void grades(int n) {
        if (n <= 100 && n >= 91) {
            System.out.println("AA");
        } else if (n <= 90 && n >= 81) {
            System.out.println("AB");
        } else if (n <= 80 && n >= 71) {
            System.out.println("BB");
        } else if (n <= 70 && n >= 61) {
            System.out.println("BC");
        } else if (n <= 60 && n >= 51) {
            System.out.println("CC");
        } else if (n <= 50 && n >= 41) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
