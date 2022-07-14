package com.company;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count = 0;
        while (n > 0) {
            int remainder = n % 10;   // last digit eg: 13453 % 10 = 3
            if (remainder == 3) {  // we will check occurence of 3.
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
