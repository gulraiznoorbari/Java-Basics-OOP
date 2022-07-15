package com.gulraiz.accessModifiers;

public class Sample {
    private int rollno;
    String name;

    public Sample(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // private and final values can be accessed in other files
    // by using getters and setters.
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
