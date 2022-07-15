package com.gulraiz.abstractDemo;

public abstract class Parent {
    String name;

    // Static method in abstract methods:
    static void hello() {
        System.out.println("Hello World");
    }

    abstract void career();
    abstract void age();
}
