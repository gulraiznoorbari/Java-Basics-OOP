package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Approach No #1
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

        // Approach No #2
        int max_num = Math.max(c ,Math.max(a,b));
        System.out.println(max_num);
    }
}
