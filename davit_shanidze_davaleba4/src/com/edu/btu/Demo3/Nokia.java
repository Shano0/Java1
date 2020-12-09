package com.edu.btu.Demo3;

public class Nokia<S> extends Simbian {
    String title;

    public Nokia(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "title='" + title + '\'' +
                '}';
    }
}