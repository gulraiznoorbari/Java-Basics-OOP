package com.gulraiz.packages;
import static com.gulraiz.packages.Message.message;

public class Greetings {
    public static void main(String[] args) {
        Hello msg = new Hello();
        msg.display();
        message();
    }
}

class Hello {
    String message;

    Hello() {
        this.message = "Hello!";
    }

    void display() {
        System.out.println(this.message);
    }
}
