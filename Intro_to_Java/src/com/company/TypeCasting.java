package com.company;

import java.util.Scanner;

public class TypeCasting {
    // int to float:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
////        int num = input.nextInt();
//        System.out.println(num);

        // Type Casting:
//        int number = (int)(65.697f);
//        System.out.println(number);

        // Automatic type conversion:
//        int x = 258;
//        byte y = (byte)(x); // 258 % 256 = 1
//        System.out.println(y);

//        byte a = 60;
//        byte b = 30;
//        byte c = 20;
//        int d = a * b / c;
//        System.out.println(d);

        // Returns ASCII value of character:
//        int number = 'A';
//        System.out.println(number);

        byte b = 50;
        char c = 'r';
        short s = 5464;
        int i = 12000;
        float f = 5.93f;
        double d = 546.3245;
        double answer = (i - c) * (d + b) - (f / s);

        System.out.println((i - c) + " " + (d + b) + " " + (f / s));
        System.out.println(answer);
    }
}

