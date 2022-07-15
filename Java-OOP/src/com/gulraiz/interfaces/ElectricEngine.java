package com.gulraiz.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine turned ON");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine turned OFF");
    }

    @Override
    public void acceleration() {
        System.out.println("Electric Engine accelerate");
    }
}
