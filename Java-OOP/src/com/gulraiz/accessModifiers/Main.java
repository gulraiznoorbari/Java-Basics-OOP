package com.gulraiz.accessModifiers;

public class Main {
    public static void main(String[] args) {
        Sample student = new Sample(10, "Ali");
        System.out.println(student.getRollno());
        student.setRollno(19);
        System.out.println(student.getRollno());
    }
}
