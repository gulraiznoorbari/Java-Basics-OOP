package com.gulraiz.inheritance;

public class Vehicle {
    String company;
    int wheels;
    int seats;
    int horsepower;
    String color;

    Vehicle() {
        this.company = "Honda";
        this.wheels = 2;
        this.seats = 2;
        this.horsepower = 200;
        this.color = "Red";
    }

    Vehicle(String company) {
        this.company = company;
    }

    Vehicle(String company, int wheels, int seats, int horsepower) {
        this.company = company;
        this.wheels = wheels;
        this.seats = seats;
        this.horsepower = horsepower;
        this.color = "red";
    }
}
