package com.edu.btu.Demo3;

public class Simbian {
    public void keyboard() {
        System.out.print("Keyboard \n");
    }

    public void printSimbian() {
        Nokia<String> nokia = new Nokia<>("Nokia");
        System.out.println(nokia);
        keyboard();

        Panasonic<String> panasonic = new Panasonic<>("Panasonic");
        System.out.println(panasonic);
        keyboard();

    }
}