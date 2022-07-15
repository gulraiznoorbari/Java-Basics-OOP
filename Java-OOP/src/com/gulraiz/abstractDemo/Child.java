package com.gulraiz.abstractDemo;

public class Child extends Parent{

    Child(String name) {
        this.name = name;
    }

    @Override
    void career() {
        System.out.println("I am going to be a engineer.");
    }

    @Override
    void age() {
        System.out.println("I am 20 years old.");
    }
}
