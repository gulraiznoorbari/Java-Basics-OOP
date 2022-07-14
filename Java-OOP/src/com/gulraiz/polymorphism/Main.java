package com.gulraiz.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        truck.wheels();
    }
}
