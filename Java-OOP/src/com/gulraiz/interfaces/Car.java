package com.gulraiz.interfaces;

public class Car implements Engine, Brake {
    int a = 3;
    @Override
    public void brake() {
        System.out.println("I am a Brake");
    }

    @Override
    public void start() {
        System.out.println("Car Started!");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped!");
    }

    @Override
    public void acceleration() {
        System.out.println("Car is accelerating!");
    }
}
