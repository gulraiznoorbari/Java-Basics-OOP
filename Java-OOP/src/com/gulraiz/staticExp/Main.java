package com.gulraiz.staticExp;

public class Main {
    public static void main(String[] args) {
        Human gulraiz = new Human(20, "Gulraiz", 100000, false);
        Human ali = new Human(22, "Ali", 200000, false);
        System.out.println(ali.population);
        System.out.println(gulraiz.population);
    }
}
