package com.company;

import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println(area(radius));
        System.out.println(circumference(radius));
    }

    static double area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    static double circumference(double radius) {
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }
}
