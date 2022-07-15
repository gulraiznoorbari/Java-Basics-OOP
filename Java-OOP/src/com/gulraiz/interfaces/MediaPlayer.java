package com.gulraiz.interfaces;

public class MediaPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Media Player turned ON!");
    }

    @Override
    public void stop() {
        System.out.println("Media Player turned OFF!");
    }
}
