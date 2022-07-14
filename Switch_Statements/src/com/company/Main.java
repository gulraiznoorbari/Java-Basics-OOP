package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();

//        switch (fruit) {
//            case "mango":
//                System.out.println("king of Fruits");
//                break;
//            case "apple":
//                System.out.println("Sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit.");
//        }

//        switch (fruit) {
//            case "mango" -> System.out.println("king of Fruits");
//            case "apple" -> System.out.println("Sweet red fruit");
//            case "orange" -> System.out.println("Round fruit");
//            default -> System.out.println("Please enter a valid fruit.");
//        }

        int day = input.nextInt();

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
