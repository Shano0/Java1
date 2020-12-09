package com.edu.btu.Demo3;

public class SamsungNote<S> extends SmartPhone {
    String title;

    public SamsungNote(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SamsungNote{" +
                "title='" + title + '\'' +
                '}';
    }
}