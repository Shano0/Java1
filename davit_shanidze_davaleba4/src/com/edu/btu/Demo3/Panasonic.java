package com.edu.btu.Demo3;

public class Panasonic<S> extends Simbian {
    String title;

    public Panasonic(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Panasonic{" +
                "title='" + title + '\'' +
                '}';
    }
}