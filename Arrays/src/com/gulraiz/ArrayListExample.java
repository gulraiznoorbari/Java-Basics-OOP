package com.gulraiz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // It is used when we want Java to handle the size of the array.
        // As we have to specify the size of the simple array in Java.

        // 1. Size is fixed internally.
        // 2. When ArrayList fills by some amount:
        //   a) It will form a new ArrayList of double the size.
        //   b) Old elements are copied in the new one.
        //   c) Old elements are deleted.

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(10);

        // Taking input:
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);

        // ArrayList methods:
        list.add(12);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);
        list.add(99);
        list.add(112);
        list.add(222);
        list.add(322);
        list.add(422);
        list.add(652);
        list.add(972);
        list.add(462);
        list.add(642);
        list.add(982);

        System.out.println(list.size());
        System.out.println(list.contains(112));
        System.out.println(list.contains(100));
        System.out.println(list);
        list.set(2, 555);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
