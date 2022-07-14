package com.gulraiz.inheritance;

public class CarPrice extends Car{
    double price;

    CarPrice(double price) {
        this.price = price;
    }

    CarPrice(String company, int wheels, int seats, int horsepower, String color, double price) {
        super(company, wheels, seats, horsepower, color);
        System.out.println(this.price);
        this.price = price;
    }
}
