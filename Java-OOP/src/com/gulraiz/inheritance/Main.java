package com.gulraiz.inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle Honda = new Vehicle();
//        System.out.println(Honda.company + " " + Honda.seats);

        Car Car = new Car();
        Car Audi = new Car("Audi", 4, 4, 2000, "White");
        System.out.println(Car.company + " " + Car.color);

        CarPrice carPrice = new CarPrice(100000);
        System.out.println(carPrice.price);

    }
}
