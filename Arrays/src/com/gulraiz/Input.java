package com.gulraiz;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        // {11,22,33,44}
        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

//      Printing using toString() method:
        System.out.print(Arrays.toString(arr));

//      Printing using Simple for-loop:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//      Printing using for-each-loop:
        for (int i : arr) {   // i represents element of the array.
            System.out.print(i + " ");
        }

        // Array of objects:
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        // modifying the array:
        str[1] = "hi";
        System.out.println(Arrays.toString(str));
    }
}
