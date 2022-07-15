package com.gulraiz.interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player = new MediaPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acceleration() {
        engine.acceleration();
    }

    public void mediaStart() {
        player.start();
    }

    public void mediaStop() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
