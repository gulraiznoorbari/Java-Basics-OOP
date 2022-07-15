package com.gulraiz.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine turned ON");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine turned OFF");
    }

    @Override
    public void acceleration() {
        System.out.println("Power Engine accelerate");
    }
}
