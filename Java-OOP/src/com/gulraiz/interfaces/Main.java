package com.gulraiz.interfaces;

public class Main {
    public static void main(String[] args) {

//        --- Things you can access LHS = versions you access RHS ---
//        We can access only the attributes/methods of the
//        Engine class that are present in Car class.

        Engine car1 = new Car();
//        car1.a;   // cannot access.
        car1.start();
        car1.acceleration();
        car1.stop();

        Car car = new Car();
        car.brake();

        Media media = new MediaPlayer();
        media.start();
        media.stop();

        NiceCar newCar = new NiceCar();
        newCar.start();
        newCar.mediaStart();
        newCar.upgradeEngine();
        newCar.stop();

    }
}
