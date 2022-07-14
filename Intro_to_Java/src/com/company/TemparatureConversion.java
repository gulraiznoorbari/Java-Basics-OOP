package com.company;

import java.util.Scanner;

public class TemparatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Celcius to Farenheit Converter");
        System.out.print("Enter temparature in Celcius: ");
        float num = input.nextFloat();
        // celcius to farenheit formula: ((C + 9/5) + 32)
        float f = (num * 9/5) + 32;
        System.out.println(f);
    }
}
