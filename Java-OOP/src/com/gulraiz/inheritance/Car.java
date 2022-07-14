package com.gulraiz.inheritance;

public class Car extends Vehicle{
    String company;
    String color;

    Car() {
        this.company = "Honda";
        this.color = "Black";
    }

    Car(String company, int wheels, int seats, int horsepower, String color) {
        super(company, wheels, seats, horsepower);
        System.out.println(super.color);
        this.color = color;
    }
}
