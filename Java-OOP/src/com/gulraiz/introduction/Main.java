package com.gulraiz.introduction;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("honda", 2020, "black", 200000);
        car1.display();
        Car car2 = new Car();
        car2.display();
    }
}

class Car {

    // Instance variables:
    String name;
    int model;
    String color;
    int price;

    // Constructor:
    Car (String name, int model, String color, int price) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    Car () {
        this.name = "Audi";
        this.model = 2022;
        this.color = "black";
        this.price = 500000;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.price);
    }
}

